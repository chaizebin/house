package com.jk.controller;

import com.jk.model.ContractBean;
import com.jk.model.FyBean;
import com.jk.service.HetongService;
import com.jk.util.ExcelUtil;
import com.jk.util.ExportExcel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
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
    @RequestMapping("delContract")
    @ResponseBody
    public void delContract(Integer id){
        hetongService.delContract(id);
    }
    @RequestMapping("queryHousingInformation")
    @ResponseBody
    public List<FyBean> queryHousingInformation(){

        return hetongService.queryHousingInformation();
    }
    /**
     * 导出报表
     * @return
     */
    @RequestMapping(value = "/downProductlById")
    @ResponseBody
    public void export(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //获取数据
        List<ContractBean> list=hetongService.downProductlById();

        //excel标题表中有几个字段就写几个
        String[] title = {"id","名字","路径","","","","","","","","",""};

        //excel文件名
        String fileName = "合同表"+System.currentTimeMillis()+".xls";

        //sheet名
        String sheetName = "合同信息表";
        String [][] content = new String[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            content[i] = new String[title.length];
            ContractBean obj = list.get(i);
            content[i][0] = obj.getId().toString();
            content[i][1] = obj.getLeaser().toString();
            content[i][2] = obj.getTenant().toString();
            content[i][3] = obj.getIdnumber().toString();
            content[i][4] = obj.getContactaddress().toString();
            content[i][5] = obj.getContactnumber().toString();
            content[i][6] = obj.getBegindate().toString();
            content[i][7] = obj.getEnddate().toString();
            content[i][8] = obj.getRent().toString();
            content[i][9] = obj.getCash().toString();
            content[i][10] = obj.getHousebelocated().toString();

        }

//创建HSSFWorkbook
        HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, content, null);

//响应到客户端
        try {
            this.setResponseHeader(response, fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(),"ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
