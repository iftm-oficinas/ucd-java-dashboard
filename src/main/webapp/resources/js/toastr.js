$(function () {

    setTimeout(function () {
        toastr.options = {
            closeButton: true,
            progressBar: true,
            showMethod: 'slideDown',
            timeOut: 4000
        };
        toastr.success('Unidos Contra a Dengue', 'Welcome to UCD');

        //toastr.success('Toast success message', 'SUCCESS');
        //toastr.info('Toast info message', 'INFO');
        //toastr.error('Toast error message', 'ERROR');
        //toastr.warning('Toast warning message', 'WARNING');

    }, 1300);

});
