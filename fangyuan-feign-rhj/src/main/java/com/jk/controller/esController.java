package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.HouseBean;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @program: house
 * @Date: 2019/4/23 23:20
 * @Author: Mr.Chai
 * @Description:
 */
@Controller
public class esController {
@Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @GetMapping("queryHouse")
    @ResponseBody
    public List<HouseBean> queryAllOrder(@RequestParam("search") String search){
        System.out.println(search);
        //拿到elastic客户端
        Client client = elasticsearchTemplate.getClient();
        //参数为索引名称
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("houseaaa")
                .setTypes("elhouse");
        //设置查询条件 boolQuery() 多条件查询

        searchRequestBuilder .setQuery(QueryBuilders.matchQuery("name",search));
        searchRequestBuilder.setQuery(QueryBuilders.boolQuery());

        HighlightBuilder highlightBuilder = new HighlightBuilder();
        highlightBuilder.field("name");
        highlightBuilder.preTags("<font color='red'>");
        highlightBuilder.postTags("</font>");
        //设置高亮查询
        searchRequestBuilder.highlighter(highlightBuilder);
        //执行查询 拿到返回值
        SearchResponse searchResponse = searchRequestBuilder.get();

        //拿到命中条数
        SearchHits hits = searchResponse.getHits();
        //获取总条数 用来分页
        //hits.getTotalHits();
        //获取到结果集迭代器
        Iterator<SearchHit> iterator = hits.iterator();
        List<HouseBean> userList = new ArrayList<HouseBean>();
        while (iterator.hasNext()){
            SearchHit next = iterator.next();
            //获取到源码内容 以json字符串的形式获取
            String sourceAsString = next.getSourceAsString();
            //获取高亮字段
            Map<String, HighlightField> highlightFields = next.getHighlightFields();
            HighlightField HouseName = highlightFields.get("name");
            HouseBean houseBean = JSON.parseObject(sourceAsString, HouseBean.class);
            //JSON.parseObject(sourceAsString, User.class);
            //使用高亮内容 替换非高亮内容
            houseBean.setCityName(HouseName.fragments()[0].toString());
            userList.add(houseBean);
        }
        return userList;
    }




}
