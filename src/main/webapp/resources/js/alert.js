Alert = {
    /**
     * Exibe um alerta generico na página
     * @param msg
     * @param titulo padrão: ATENÇÃO
     * @param ic ícone utilizado. Padrão
     */
    alert : function(msg, callback, titulo, ic, size)
    {
        if(!titulo) titulo = 'MENSAGEM DO SISTEMA';
        if(!ic) ic = 'fa-info';
        if(!size) size = 'small';
        return bootbox.alert({
            size: size,
            message: msg,
            title: titulo,
            callback: callback,
            locale: 'br'
        });
    },
    /**
     * Exibe um alert na tela, porém grande
     * @param msg
     * @param callback
     * @param titulo
     * @param ic
     * @param size
     * @returns {*}
     */
    bigAlert : function(msg, callback, titulo, ic, size)
    {
        return this.alert(msg, callback, titulo, ic, 'large');
    },

    /**
     * Exibe uma mensagem de erro na página
     * @param msg
     * @param titulo
     * @param ic
     * @returns {*}
     */
    error : function(msg, callback, titulo, ic, size)
    {
        if(!titulo) titulo = 'ATENÇÃO';
        if(!ic) ic = 'fa-exclamation-triangle';
        return this.alert(msg, callback, titulo, ic, size);
    },

    /**
     * Exibe um alerta de erro na página, porém grande
     * @param msg
     * @param callback
     * @param titulo
     * @param ic
     * @param size
     * @returns {*}
     */
    bigError: function(msg, callback, titulo, ic)
    {
        return this.error(msg, callback, titulo, ic, 'large');
    },

    /**
     * Exibe uma mensagem para confirmação na tela
     * @param msg
     * @param titulo
     * @param ic
     * @returns {*}
     */
    confirm : function(msg, callback, titulo, ic, size)
    {
        if(!titulo) titulo = 'CONFIRMAÇÃO';
        if(!ic) ic = 'fa-question';
        if(!size) size = 'small';
        if(!callback) callback = function(){};
        return bootbox.confirm({
            message: msg,
            size: size,
            callback: callback,
            locale: 'br',
            title: titulo
        });
    },

    /**
     * Exibe uma mensagem para confirmação, porém uma mensagem grande.
     * @param msg
     * @param callback
     * @param titulo
     * @param ic
     * @param size
     * @returns {*}
     */
    largeConfirm : function(msg, callback, titulo, ic)
    {
        return this.confirm(msg, callback, titulo, ic, 'large');
    },


    /**
     * Exibe uma caixa solicitando uma informação
     * @param msg
     * @param callback
     * @param titulo
     * @param size
     * @returns {*}
     */
    prompt : function(msg, callback, size)
    {
        if(!size) size = 'small';
        if(!callback) callback = function(){};
        return bootbox.prompt({
            title: msg,
            message :  msg,
            callback: callback,
            size: size,
            locale: 'br'
        });
    },

    /**
     * Exibe uma caixa solicitando uma informação, porém uma caixa grande.
     * @param msg
     * @param callback
     * @param titulo
     * @returns {*}
     */
    largePrompt : function(msg, callback)
    {
        return this.prompt(msg, callback, 'large');
    },

    TOAST_SUCCESS: 'success',
    TOAST_INFO: 'info',
    TOAST_ERROR: 'error',
    TOAST_WARNING: 'warning',
    /**
     * Exibe uma mensagem do tipo TOASTER, de acordo com o parametro passado
     * @param tipo
     * @param msg
     */
    toast: function(tipo, msg, titulo){

        toastr.options = {
            "closeButton": true,
            "debug": false,
            "newestOnTop": true,
            "progressBar": true,
            "positionClass": "toast-top-right",
            "preventDuplicates": false,
            "onclick": null,
            "showDuration": "400",
            "hideDuration": "2000",
            "timeOut": "8000",
            "extendedTimeOut": "2000",
            "showEasing": "swing",
            "hideEasing": "linear",
            "showMethod": "fadeIn",
            "hideMethod": "fadeOut"
        }

        if(!titulo){
            switch(tipo){
                case this.TOAST_ERROR: titulo = "ERRO"; break;
                case this.TOAST_INFO: titulo = "Mensagem"; break;
                case this.TOAST_SUCCESS: titulo = "Sucesso!"; break;
                case this.TOAST_WARNING: titulo = "Aviso"; break;
            }
        }
        toastr[tipo](msg, titulo);
    }
};