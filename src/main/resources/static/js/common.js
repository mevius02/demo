$(function () {
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  // 現在日時のリアルタイム表示
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
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
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  // datepicker
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  $(".datepicker-ymd").datepicker({
    language: "ja",
    format: "yyyy/mm/dd",
    autoclose: true,
    todayBtn: true,
    clearBtn: true,
    todayHighlight: true,
    daysOfWeekHighlighted: [0, 6],
    // モバイル端末のキーボード無効化
    disableTouchKeyboard: false,
    // inputタグ(入力フォーム)に[readonly]が指定されている場合、ピッカーを表示しない
    enableOnReadonly: true,
    // 選択可能範囲[過去]
    startDate: "1900/01/01",
    // 選択可能範囲[未来]
    endDate: "2100/12/31",
    // 表示モードの上限/下限
    maxViewMode: "years",
    minViewMode: "days",
    // 選択されている日付を再度選択で、日付クリア
    toggleActive: true,
    // 曜日の始まり指定
    weekStart: 1,
    templates: {
      leftArrow: "<i class='bi bi-arrow-left-circle'></i>",
      rightArrow: "<i class='bi bi-arrow-right-circle'></i>",
    },
  });
  $(".datepicker-ym").datepicker({
    language: "ja",
    format: "yyyy/mm",
    autoclose: true,
    todayBtn: true,
    clearBtn: true,
    todayHighlight: true,
    daysOfWeekHighlighted: [0, 6],
    disableTouchKeyboard: false,
    enableOnReadonly: true,
    startDate: "1900/01/01",
    endDate: "2100/12/31",
    maxViewMode: "years",
    minViewMode: "months",
    toggleActive: true,
    weekStart: 1,
    templates: {
      leftArrow: "<i class='bi bi-arrow-left-circle'></i>",
      rightArrow: "<i class='bi bi-arrow-right-circle'></i>",
    },
  });
  $(".datepicker-md").datepicker({
    language: "ja",
    format: "yyyy/mm/dd",
    autoclose: true,
    todayBtn: true,
    clearBtn: true,
    todayHighlight: true,
    daysOfWeekHighlighted: [0, 6],
    disableTouchKeyboard: false,
    enableOnReadonly: true,
    startDate: "1900/01/01",
    endDate: "2100/12/31",
    maxViewMode: "months",
    minViewMode: "days",
    toggleActive: true,
    weekStart: 1,
    templates: {
      leftArrow: "<i class='bi bi-arrow-left-circle'></i>",
      rightArrow: "<i class='bi bi-arrow-right-circle'></i>",
    },
  });
  $(".datepicker-y").datepicker({
    language: "ja",
    format: "yyyy",
    autoclose: true,
    todayBtn: true,
    clearBtn: true,
    todayHighlight: true,
    daysOfWeekHighlighted: [0, 6],
    disableTouchKeyboard: false,
    enableOnReadonly: true,
    startDate: "1900/01/01",
    endDate: "2100/12/31",
    maxViewMode: "years",
    minViewMode: "years",
    toggleActive: true,
    weekStart: 1,
    templates: {
      leftArrow: "<i class='bi bi-arrow-left-circle'></i>",
      rightArrow: "<i class='bi bi-arrow-right-circle'></i>",
    },
  });
  $(".datepicker-m").datepicker({
    language: "ja",
    format: "mm",
    autoclose: true,
    todayBtn: true,
    clearBtn: true,
    todayHighlight: true,
    daysOfWeekHighlighted: [0, 6],
    disableTouchKeyboard: false,
    enableOnReadonly: true,
    startDate: "1900/01/01",
    endDate: "2100/12/31",
    maxViewMode: "months",
    minViewMode: "months",
    toggleActive: true,
    weekStart: 1,
    templates: {
      leftArrow: "<i class='bi bi-arrow-left-circle'></i>",
      rightArrow: "<i class='bi bi-arrow-right-circle'></i>",
    },
  });
  $(".datepicker-d").datepicker({
    language: "ja",
    format: "dd",
    autoclose: true,
    todayBtn: true,
    clearBtn: true,
    todayHighlight: true,
    daysOfWeekHighlighted: [0, 6],
    disableTouchKeyboard: false,
    enableOnReadonly: true,
    startDate: "1900/01/01",
    endDate: "2100/12/31",
    maxViewMode: "days",
    minViewMode: "days",
    toggleActive: true,
    weekStart: 1,
    templates: {
      leftArrow: "<i class='bi bi-arrow-left-circle'></i>",
      rightArrow: "<i class='bi bi-arrow-right-circle'></i>",
    },
  });
  $(".datepicker-ymd-multi").datepicker({
    language: "ja",
    format: "yyyy/mm/dd",
    autoclose: true,
    todayBtn: true,
    clearBtn: true,
    todayHighlight: true,
    daysOfWeekHighlighted: [0, 6],
    disableTouchKeyboard: false,
    enableOnReadonly: true,
    startDate: "1900/01/01",
    endDate: "2100/12/31",
    maxViewMode: "years",
    minViewMode: "days",
    toggleActive: true,
    weekStart: 1,
    templates: {
      leftArrow: "<i class='bi bi-arrow-left-circle'></i>",
      rightArrow: "<i class='bi bi-arrow-right-circle'></i>",
    },
    // 複数選択
    multidate: false,
    // 複数選択時の区切り文字
    multidateSeparator: ",",
  });
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  // パスワード[表示/非表示]切替
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  $("[name=showPassword]").on("click", function () {
    if ($(this).hasClass("bi-eye-slash-fill")) {
      $(this).removeClass("bi-eye-slash-fill");
      $(this).addClass("bi-eye-fill");
      document.getElementById($(this).data("id")).setAttribute("type", "text");
    } else {
      $(this).removeClass("bi-eye-fill");
      $(this).addClass("bi-eye-slash-fill");
      document
        .getElementById($(this).data("id"))
        .setAttribute("type", "password");
    }
  });
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  // 入力クリアボタン
  // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  $("[name=clearInput]").on("click", function () {
    document.getElementById($(this).data("id")).value = "";
  });
});

// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
// システムテーマ反映
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
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

// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
// 入力半角のみ
// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
function harfWidthOnly($this) {
  var str = $this.value;
  while (str.match(/[^A-Z^a-z\d\-]/)) {
    str = str.replace(/[^A-Z^a-z\d\-]/, "");
  }
  $this.value = str;
}
