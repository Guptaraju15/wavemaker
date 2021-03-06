/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.hrdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Qualifier;
import com.hrdb.service.HrdbQueryExecutorService;
import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController(value = "Hrdb.QueryExecutionController")
@RequestMapping("/hrdb/queryExecutor")
@Api(description = "Controller class for query execution", value = "QueryExecutionController")
public class QueryExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutionController.class);

    @Autowired
    private HrdbQueryExecutorService queryService;

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/EmployeeListOf_DeptId1", method = RequestMethod.GET)
    public Page<Object> executeEmployeeListOf_DeptId1(Pageable pageable) {
        LOGGER.debug("Executing named query EmployeeListOf_DeptId1");
        Page<Object> result = queryService.executeEmployeeListOf_DeptId1(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/EmployeeListOf_DeptId2", method = RequestMethod.GET)
    public Page<Object> executeEmployeeListOf_DeptId2(Pageable pageable) {
        LOGGER.debug("Executing named query EmployeeListOf_DeptId2");
        Page<Object> result = queryService.executeEmployeeListOf_DeptId2(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/Srv_Var_EmployeeCount", method = RequestMethod.GET)
    public Page<Object> executeSrv_Var_EmployeeCount(Pageable pageable) {
        LOGGER.debug("Executing named query Srv_Var_EmployeeCount");
        Page<Object> result = queryService.executeSrv_Var_EmployeeCount(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/TotalBudget", method = RequestMethod.GET)
    public Page<Object> executeTotalBudget(Pageable pageable) {
        LOGGER.debug("Executing named query TotalBudget");
        Page<Object> result = queryService.executeTotalBudget(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/checking", method = RequestMethod.GET)
    public Page<Object> executeChecking(Pageable pageable) {
        LOGGER.debug("Executing named query checking");
        Page<Object> result = queryService.executeChecking(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/EmploteeList", method = RequestMethod.GET)
    public Page<Object> executeEmploteeList(Pageable pageable) {
        LOGGER.debug("Executing named query EmploteeList");
        Page<Object> result = queryService.executeEmploteeList(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/EmployeeListOf_DeptId5", method = RequestMethod.GET)
    public Page<Object> executeEmployeeListOf_DeptId5(Pageable pageable) {
        LOGGER.debug("Executing named query EmployeeListOf_DeptId5");
        Page<Object> result = queryService.executeEmployeeListOf_DeptId5(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/EmployeeListOf_DeptId4", method = RequestMethod.GET)
    public Page<Object> executeEmployeeListOf_DeptId4(Pageable pageable) {
        LOGGER.debug("Executing named query EmployeeListOf_DeptId4");
        Page<Object> result = queryService.executeEmployeeListOf_DeptId4(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/SearchEmployees", method = RequestMethod.GET)
    public Page<Object> executeSearchEmployees(Pageable pageable) {
        LOGGER.debug("Executing named query SearchEmployees");
        Page<Object> result = queryService.executeSearchEmployees(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/NoOfDepartment", method = RequestMethod.GET)
    public Page<Object> executeNoOfDepartment(Pageable pageable) {
        LOGGER.debug("Executing named query NoOfDepartment");
        Page<Object> result = queryService.executeNoOfDepartment(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/SelectEmployeeVar", method = RequestMethod.GET)
    public Page<Object> executeSelectEmployeeVar(@RequestParam(value = "SearchID", required = false) java.lang.Integer SearchID, @RequestParam(value = "LiveListID", required = false) java.lang.Integer LiveListID, Pageable pageable) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named query SelectEmployeeVar");
        Page<Object> result = queryService.executeSelectEmployeeVar(pageable, SearchID, LiveListID);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/SelectEmployee", method = RequestMethod.GET)
    public Page<Object> executeSelectEmployee(@RequestParam(value = "SearchID", required = false) java.lang.Integer SearchID, @RequestParam(value = "LiveListID", required = false) java.lang.Integer LiveListID, Pageable pageable) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named query SelectEmployee");
        Page<Object> result = queryService.executeSelectEmployee(pageable, SearchID, LiveListID);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/EmployeeListOf_Deptid3", method = RequestMethod.GET)
    public Page<Object> executeEmployeeListOf_Deptid3(Pageable pageable) {
        LOGGER.debug("Executing named query EmployeeListOf_Deptid3");
        Page<Object> result = queryService.executeEmployeeListOf_Deptid3(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/_ColleagueDetails", method = RequestMethod.GET)
    public Page<Object> execute_ColleagueDetails(@RequestParam(value = "selectedemployeedeptid", required = false) java.lang.Integer selectedemployeedeptid, @RequestParam(value = "selectedemployeeid", required = false) java.lang.Integer selectedemployeeid, Pageable pageable) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named query _ColleagueDetails");
        Page<Object> result = queryService.execute_ColleagueDetails(pageable, selectedemployeedeptid, selectedemployeeid);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/EmployeeSelectVar", method = RequestMethod.GET)
    public Page<Object> executeEmployeeSelectVar(@RequestParam(value = "SelectedEmployee", required = false) java.lang.Integer SelectedEmployee, Pageable pageable) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named query EmployeeSelectVar");
        Page<Object> result = queryService.executeEmployeeSelectVar(pageable, SelectedEmployee);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @ApiOperation(value = "Process request to execute queries")
    @RequestMapping(value = "/queries/DepartmentCount", method = RequestMethod.GET)
    public Page<Object> executeDepartmentCount(Pageable pageable) {
        LOGGER.debug("Executing named query DepartmentCount");
        Page<Object> result = queryService.executeDepartmentCount(pageable);
        LOGGER.debug("got the result of named query {}", result);
        return result;
    }

    @RequestMapping(value = "/queries/wm_custom", method = RequestMethod.POST)
    @ApiOperation(value = "Process request to execute customer queries")
    public Page<Object> executeWMCustomQuery(@RequestBody CustomQuery query, Pageable pageable) {
        Page<Object> result = queryService.executeWMCustomQuerySelect(query, pageable);
        LOGGER.debug("got the result {}" + result);
        return result;
    }

    @RequestMapping(value = "/queries/wm_custom_update", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute customer queries")
    public int executeWMCustomQuery(@RequestBody CustomQuery query) {
        int result = queryService.executeWMCustomQueryUpdate(query);
        LOGGER.debug("got the result {}" + result);
        return result;
    }
}
