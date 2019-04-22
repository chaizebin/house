package com.jk.controller;

import com.jk.model.ContractBean;
import com.jk.model.FyBean;
import com.jk.service.HetongService;
import com.jk.service.HetongServiceImpl;
import com.jk.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;

@Controller

public class HetongController {
    @Autowired
    private HetongService hetongService;

    @RequestMapping("tese")
    @ResponseBody
    public String test() {
        return "s";
    }
    @RequestMapping("queyrContract")
    @ResponseBody
        public HashMap<String,Object> queyrContract(Integer page,Integer rows,ContractBean contractBean){

        return hetongService.queyrContract(page,rows,contractBean);
    }
    @RequestMapping("savecontract")
    @ResponseBody
    public void savecontract(@RequestBody ContractBean contractBean){
        if(contractBean.getId() == null){
            hetongService.savecontract(contractBean);
        }
        hetongService.updatecontract(contractBean);
    }
    @ResponseBody
    @RequestMapping("downProductlById")//serialId是前台传来信息的id,filename是文件存放地址,这个会让选择的
    public String downProductlById(@RequestBody Integer id, HttpServletResponse response, String filename) throws IOException {
        //名字
        String sheetName="中标产品表";
        //标题
        String titleName="中标产品表名单";
        //字段,这个得在这写好
        String[] headers = {"编号", "名称","规格","生产企业"};
        //根据传来的id查询出来的list集合
        List<ContractBean> winningDrug = hetongService.downProductlById(id);
        String resultUrl=filename+".xlsx";
        String pattern="yyyy-MM-dd";
        OutputStream output = response.getOutputStream();
        response.reset();
        response.setHeader("Content-disposition","attachment; filename="+filename+".xls");
        response.setContentType("application/msexcel");
        ExportExcel.exportExcel(sheetName, titleName, headers, winningDrug, output, pattern);
        return "success";
    }
    @RequestMapping("selectcontractId")
    @ResponseBody
    public ContractBean selectcontractId(@RequestBody Integer id){

        return hetongService.selectcontractId(id);
    }
    @RequestMapping("delContract")
    @ResponseBody
    public void delContract(@RequestBody Integer id){

         hetongService.delContract(id);
    }

    @RequestMapping("queryHousingInformation")
    @ResponseBody
    public List<FyBean> queryHousingInformation(){

       return hetongService.queryHousingInformation();
    }
}
