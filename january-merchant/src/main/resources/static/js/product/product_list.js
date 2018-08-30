
const $table = $('#product_list');

$table.bootstrapTable({
    url: "/v1/products",
    method: "get",
    sidePagination:"server",
    queryParams: function(params){
        var queryData = {};    //如果没有额外的查询参数的话就新建一个空对象，如果有的话就先装你的查询参数
        //然后增加这两个
        queryData.limit = params.limit;
        queryData.offset = params.offset;
        return queryData;    //这个就是向服务端传递的参数对象
    },
    columns: [{
        field: 'id',
        title: 'ID'
    }, {
        field: 'name',
        title: '商品名称'
    }, {
        field: 'price',
        title: '商品价格'
    }, {
        field: 'inStocks',
        title: '库存'
    }, {
        field: 'description',
        title: '描述'
    }, {
        field: 'state',
        title: '状态'
    }, {
        field: 'price',
        title: '商品价格'
    }]
});