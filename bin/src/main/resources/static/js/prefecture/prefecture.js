$(function(){
	$('#btnSearch').on('click', function(){
	});
	$('#btnReloadSearchArea').on('click', function(){
		$.ajax({
			type : 'GET',
			url : $('#btnReloadSearchArea').data('url'),
			data : $('#searchForm').serialize(),
			dataType : 'html',
			success : function(data, status, xhr){
				console.log('done');
				$('#searchArea').html(data);
			},
			error : function(jqxhr, status, exception){
				console.debug('jqxhr', jqxhr);
				console.debug('status', status);
				console.debug('exception', exception);
			}
		}).done(function(response){
			console.log('done');
		}).fail(function(){
			console.log('fail');
		});
	});
});