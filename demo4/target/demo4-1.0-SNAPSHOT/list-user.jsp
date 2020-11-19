<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 11/14/2020
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>

<%@page import="data.account"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="Model_Query.BLlstUser" %>
<%@ page import="Model_Query.BLlistUser" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="Model_Query.BLlistUser" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>List User</title>
    <!-- BOOTSTRAP STYLES-->
    <link rel="stylesheet" href="./Static/css/bootstrap.css">
    <link rel="stylesheet" href="./Static/css/custom.css">
    <link rel="stylesheet" href="./Static/css/font-awesome.css">

    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans'
          rel='stylesheet' type='text/css' />
    <!-- TABLE STYLES-->
    <link href="${url}/js/dataTables/dataTables.bootstrap.css"
          rel="stylesheet" />
</head>
<body>
    <%
        BLlstUser bllstUser = new BLlstUser();
        ResultSet kq = null;
        kq = bllstUser.TableAccount();
    %>
    <%
        BLlistUser bLlistUsers = new BLlistUser();
        ArrayList<account> list = bLlistUsers.getListAccount();
        System.out.println(list.size());
    %>

<div id="wrapper">


    <div id="page-wrapper">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h2>List User</h2>
                    <h5>You can edit , add, delete User</h5>

                </div>
            </div>
            <!-- /. ROW  -->
            <hr />

            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->

                    <div class="panel panel-default">
                        <div class="panel-heading">Advanced Tables</div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover"
                                       id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Email</th>
                                        <th>User Name</th>
                                        <th>Password</th>
                                        <th>Avatar</th>
                                        <th>Address</th>
                                        <th>Permission</th>


                                    </tr>
                                    </thead>
                                    <tbody>
<%--                                        <%--%>
<%--                                            while(kq.next()){--%>
<%--                                        %>--%>
<%--                                        <tr class="odd gradeX">--%>
<%--                                            <td></td>--%>
<%--                                            <td></td>--%>
<%--                                            <td><%=kq.getString(1)%></td>--%>
<%--                                            <td><%=kq.getString(2)%></td>--%>
<%--                                            <td></td>--%>
<%--                                            <td></td>--%>
<%--                                            <td></td>--%>
<%--                                            <td></td>--%>
<%--                                            --%>
<%--                                          --%>
<%--                                        </tr><% } %>--%>

                                        <%
                                            for (account a : list){
                                        %>
                                        <tr class="odd gradeX">
                                            <td><%=a.getId()%></td>
                                            <td><%=a.getEmail()%></td>
                                            <td><%=a.getUsername()%></td>
                                            <td><%=a.getPassword()%></td>
                                            <td><%=a.getAvatar()%></td>
                                            <td><%=a.getAddress()%></td>
                                            <td><%=a.getPermission()%></td>



                                        </tr><% } %>



                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>

                    <!--End Advanced Tables -->
                </div>
            </div>

        </div>

    </div>
    <!-- /. PAGE INNER  -->
</div>
<!-- /. PAGE WRAPPER  -->
<!-- /. WRAPPER  -->
<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY SCRIPTS -->
<script src="${url}/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="${url}/js/bootstrap.min.js"></script>
<!-- METISMENU SCRIPTS -->
<script src="${url}/js/jquery.metisMenu.js"></script>
<!-- DATA TABLE SCRIPTS -->
<script src="${url}/js/dataTables/jquery.dataTables.js"></script>
<script src="${url}/js/dataTables/dataTables.bootstrap.js"></script>
<script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
</script>
<!-- CUSTOM SCRIPTS -->
<script src="${url}/js/custom.js"></script>

</body>
</html>
