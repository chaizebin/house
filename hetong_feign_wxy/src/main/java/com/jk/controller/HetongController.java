package com.jk.controller;

import com.jk.model.ContractBean;
import com.jk.service.HetongService;
import com.jk.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
@Controller

public class HetongController {

    @RequestMapping("shaxiang")
    public String toSha(){
        return "sha";
    }

    @Autowired
    private HetongService hetongService;
    @RequestMapping("queyrContract")
    @ResponseBody
    public HashMap<String,Object> queyrContract(Integer page,Integer rows,ContractBean contractBean){
        System.out.println("page"+page+"rows"+rows);
        return hetongService.queyrContract(page,rows,contractBean);
    }
    @RequestMapping("toqueryll")
    public String toquery(){
        return "main";
    }
    @RequestMapping("savecontract")
    @ResponseBody
    public void savecontract( ContractBean contractBean){
        hetongService.savecontract(contractBean);
    }
    @RequestMapping("toadd")
    public String toadd(){
        return "toAddComm";
    }
    @RequestMapping("selectcontractId")
    @ResponseBody
    public ContractBean selectcontractId(Integer id){
        System.out.println("ssdasdas"+id);
        return hetongService.selectcontractId(id);
    }
    @DeleteMapping("delCommodity")
    @ResponseBody
    public String delCommodity(Integer Id){
        return hetongService.delCommodity(Id);
    }
    @RequestMapping("dk")
    public String dk(){
        return "dk";
    }
    @ResponseBody
    @RequestMapping("downProductlById")//serialId是前台传来信息的id,filename是文件存放地址,这个会让选择的
    public String downProductlById(Integer id, HttpServletResponse response, String filename) throws IOException {
        System.out.println("id"+id+"文件名"+filename);
        //名字
        String sheetName="合同表";
        //标题
        String titleName="合同表名单";
        //字段,这个得在这写好
        String[] headers = {"编号", "租借人","承租人","生产企业",};
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
    @RequestMapping("delContract")
    @ResponseBody
    public void delContract(Integer id){
        System.out.println("删除的id为"+id);
        hetongService.delContract(id);
    }
}
