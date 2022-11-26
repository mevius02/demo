// 現在日時の表示
$(function () {
  setInterval(function () {
    var today = new Date();
    $weekday = ["日", "月", "火", "水", "木", "金", "土"];
    month = today.getMonth() + 1;
    $("#timestamp").html(
      today.getFullYear() +
        "/" +
        month +
        "/" +
        today.getDate() +
        "(" +
        $weekday[today.getDay()] +
        ") " +
        today.getHours() +
        ":" +
        ("0" + today.getMinutes()).slice(-2)
    );
  }, 0);
});

// 入力半角のみ
function harfWidthOnly($this) {
  var str = $this.value;
  while (str.match(/[^A-Z^a-z\d\-]/)) {
    str = str.replace(/[^A-Z^a-z\d\-]/, "");
  }
  $this.value = str;
}

// システムテーマ反映
$(document).ready(function () {
  $.ajax({
    type: "POST",
    url: "/common/getSystemThema",
    dataType: "text",
    success: function (data) {
      $("body").removeClass();
      $("body").addClass(data);
    },
    error: function (jqXHR, textStatus, errorThrown) {
      alert("error");
    },
  });
});
