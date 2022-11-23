package com.csms.controller;

import com.csms.domain.Salesman;
import com.csms.service.ManagerService;
import com.csms.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//2.定义controller
// 2.1使用@Controller定义bean
//@Controller
//public class LoginController {
//    @RequestMapping("/save")
//    //2.3设置当前操作的返回值类型
//    @ResponseBody
//    public String save() {
//        System.out.println("user save..…");
//        return "{'user'：'save'}";
//    }
//
//    @RequestMapping("/delete")
//    //2.3设置当前操作的返回值类型
//    @ResponseBody
//    public String delete() {
//        System.out.println("user delete..…");
//        return "{'user'：'delete'}";
//    }
//
//    @RequestMapping("/update")
//    //2.3设置当前操作的返回值类型
//    @ResponseBody
//    public String update() {
//        System.out.println("user update..…");
//        return "{'user'：'update'}";
//    }
//
//    @RequestMapping("/getById")
//    //2.3设置当前操作的返回值类型
//    @ResponseBody
//    public String getById() {
//        System.out.println("user getById..…");
//        return "{'user'：'getById'}";
//    }
//}


//2.定义controller
// 2.1使用@Controller定义bean


/**
 * 案例
 */
////使用REST风格
////@Controller
////@ResponseBody
////上两行直接替换成下一行
//@RestController
//@RequestMapping("/logins")
//public class LoginController {
////    @RequestMapping("/save")
////    @RequestMapping(method = RequestMethod.POST)
//    @PostMapping
//    //2.3设置当前操作的返回值类型
//    public String save() {
//        System.out.println("logins save..…");
//        return "{'logins'：'save'}";
//    }
//
////    localhost:8080/logins/1
//    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
//    //2.3设置当前操作的返回值类型
//    //请求的数据就用@RequestBody
//    public String delete(@PathVariable Integer id) {
//        System.out.println("logins delete..…"+id);
//        return "{'logins'：'delete'}";
//    }
//
//    @RequestMapping(method = RequestMethod.PUT)
//    //2.3设置当前操作的返回值类型
//    public String update() {
//        System.out.println("logins update..…");
//        return "{'logins'：'update'}";
//    }
//
//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
//    //2.3设置当前操作的返回值类型
//    public String getById(@PathVariable Integer id) {
//        System.out.println("logins getById..…"+id);
//        return "{'logins'：'getById'}";
//    }
//}



@RestController
@RequestMapping("/logins")
public class LoginController {
    @Autowired
    private ManagerService managerService;
    @Autowired
    private SalesmanService salesmanService;

//    @Autowired
//    private SalesmanService managerService;

    @GetMapping("/{username}/{password}/{type}")
    public Result login(@PathVariable String username,@PathVariable String password,@PathVariable int type){
        Boolean flag = true;
//        管理员
        if(type==1) {
            flag = managerService.mana_login(username, password);
            return new Result(flag ? Code.GET_OK:Code.GET_ERR,flag);
        }else{
            String sale_id = salesmanService.sale_login(username, password);
            return new Result(!"".equals(sale_id) ? Code.GET_OK:Code.GET_ERR,sale_id);
        }
    }
}



