
const $table = $('#product_list');

$table.bootstrapTable({
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