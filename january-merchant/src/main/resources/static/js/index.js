new Vue({
    el: '#index',
    data: {
        activeIndex: '1',
        message: "You Have Login.(Merchant)",
        theme1: 'dark',
        form: {
            name: '',
            password: '',
        }
    },
    methods: {
        handleSelect(key, keyPath) {
            console.log(key, keyPath);
        },
        signIn() {
            console.log(this.form);
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