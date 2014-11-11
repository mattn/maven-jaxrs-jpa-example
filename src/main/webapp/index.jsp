<%@ page pageEncoding="UTF-8" %>
<html>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<style>
#grid, #grid td, #grid th {
	border: 1px #000000 solid;
	border-collapse: collapse;
	padding: 2px;
}
</style>
<script>
$(function() {
	$.getJSON("/foo/webapi/myresource", function(data) {
		var grid = $('#grid tbody');
		$.each(data, function(i, e) {
			var row = $('<tr/>')
			$('<td/>').text(e.key).appendTo(row);
			$('<td/>').text(e.value).appendTo(row);
			grid.append(row);
		});
	});
});
</script>
<body>
    <h2>ジャージー牛乳!</h2>
    <table id="grid">
    <thead>
    <tr><th>項目</th><th>値</th></tr>
    </thead>
    <tbody>
    </tbody>
    </table>
</body>
</html>
