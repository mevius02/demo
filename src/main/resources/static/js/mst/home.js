$(function () {
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  // マスタタイトル選択ドロップダウン
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  $("#selectMstTitle").change(function () {
    var url = $(this).val();
    window.location.href = url;
  });
});
