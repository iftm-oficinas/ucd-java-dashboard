<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <title>Unidos Contra a Dengue</title>

    <!-- Mainly styles -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="fonts/font-awesome/css/font-awesome.css" rel="stylesheet" />

    <!-- Toastr -->
    <link href="css/plugins/toastr/toastr.min.css" rel="stylesheet" />

    <!-- Gritter -->
    <link href="js/plugins/gritter/jquery.gritter.css" rel="stylesheet" />

    <!-- Custom styles -->
    <link href="css/animate.css" rel="stylesheet" />
    <link href="css/style.css" rel="stylesheet" />
    <link href="css/toastr.css" rel="stylesheet" />

    <!-- Mainly scripts -->
    <script src="js/jquery-2.2.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

    <!-- Peity -->
    <script src="js/plugins/peity/jquery.peity.min.js"></script>

    <!-- Isnpinia -->
    <script src="js/inspinia.js"></script>
    
    <!-- Pace -->
    <script src="js/plugins/pace/pace.min.js"></script>

    <!-- jQuery UI -->
    <script src="js/plugins/jquery-ui/jquery-ui.min.js"></script>

    <!-- GITTER -->
    <script src="js/plugins/gritter/jquery.gritter.min.js"></script>

    <!-- Toastr -->
    <script src="js/plugins/toastr/toastr.min.js"></script>

</head>

<body>

<!-- Plano de Fundo -->
<div id="wrapper">

    <!-- Menu Lateral -->
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav metismenu" id="side-menu">

                <!-- Usuario Logado -->
                <li class="nav-header">
                    <div class="dropdown profile-element" align="center">
                        <a data-toggle="dropdown" class="dropdown-toggle">
                            <span class="clear">
                                <span class="block m-t-xs">
                                    <strong class="font-bold"><a href="/ucd/index.html">Unidos Contra a Dengue</a></strong>
                                </span>
                            </span>
                        </a>
                    </div>
                    <div class="logo-element">
                        UCD
                    </div>
                </li>

                <!-- Menu -->
                <li class="active">
                    <a><i class="fa fa-th-large"></i>
                        <span class="nav-label">Painel de Controle</span>
                        <span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="/ucd/ranking/index">Ranking</a>
                        </li>
                        <li class="active">
                            <a href="/ucd/user/index">Usuários</a>
                        </li>
                        <li>
                            <a href="/ucd/complaint/index">Denúncias</a>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </nav>

    <!-- Corpo -->
    <div id="page-wrapper" class="gray-bg">

        <!-- Menu Superior -->
        <div class="row  border-bottom white-bg">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 10px">
                <div class="navbar-header">
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary">
                        <i class="fa fa-bars"></i>
                    </a>
                </div>
            </nav>
        </div>

        <!-- Conteudo -->
        <div class="row">
            <div class="col-xm-12 col-sm-12 col-md-12 col-lg-12">
                <div class="wrapper wrapper-content">
                    <div class="row">
                        <div class="col-xm-12 col-sm-12 col-md-12 col-lg-12">
                            <div class="ibox float-e-margins">

                                <!-- Titulo -->
                                <div class="ibox-title">
                                    <h5>Novo Usuário</h5>
                                    <div class="ibox-tools">
                                        <a class="collapse-link">
                                            <i class="fa fa-chevron-up"></i>
                                        </a>
                                        <a class="close-link">
                                            <i class="fa fa-times"></i>
                                        </a>
                                    </div>
                                </div>

                                <!-- Formulario -->
                                <div class="ibox-content">

                                    <div class="row">
                                        <div class="col-sm-12 b-r">
                                            <form role="form" action="/ucd/user/store" method="POST">
                                                <div class="form-group">
                                                    <label>Nome</label>
                                                    <input type="text" placeholder="Name" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label>Email</label>
                                                    <input type="email" placeholder="Email" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label>Senha</label>
                                                    <input type="password" placeholder="Password" class="form-control">
                                                </div>
                                                <div>
                                                    <button class="btn btn-sm btn-primary pull-right m-t-n-xs"
                                                            type="submit"><strong>Cadastrar</strong></button>
                                                    <label>
                                                        <input type="checkbox" class="i-checks"> Inspetor?
                                                    </label>
                                                </div>
                                            </form>
                                        </div>
                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Rodape -->
        <div class="footer" align="bottom">
            <div class="pull-right">
                5º período.
            </div>
            <div>
                <strong>Copyright</strong> Desenvolvimento de Aplicações WEB II &copy; 2016
            </div>
        </div>

    </div>

</div>

<!-- Custom javascripts -->
<script src="js/alert.js"></script>
<script src="js/peity.js"></script>

</body>
</html>
