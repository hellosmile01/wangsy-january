new Vue({
    el: '#login',
    data: {
        activeIndex: '2',
        message: "登录页",
        theme1: 'dark',
        form: {
            name: '',
            password: '',
        }
    },
    methods: {
        handleSelect(key, keyPath) {
            console.log(key, keyPath);
            if ("3"===key) {
                window.location.href("index.html");
                /*$.ajax({
                    url: '/index',
                    data: {},
                    type: "get",
                    dataType: "json",
                    cache: false,
                    success: function (res) {

                    },
                    error:function(res){

                    }
                });*/
            }
        },
        signIn() {
            $.ajax({
                url: '/authentication/form',
                data: {
                    username: this.form.name,
                    password: this.form.password
                },
                type: "post",
                dataType: "json",
                cache: false,
                success: function (res) {
                    console.log(res);
                    if(res.authenticated) {
                        $.ajax({
                            url: '/index',
                            type: "get",
                        });
                    }
                },
                error:function(res){
                    console.log(res);
                }
            });
        }
    }
});