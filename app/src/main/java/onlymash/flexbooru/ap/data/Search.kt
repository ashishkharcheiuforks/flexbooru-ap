package onlymash.flexbooru.ap.data

import onlymash.flexbooru.ap.common.DATE_RANGE_ANYTIME
import onlymash.flexbooru.ap.common.ORDER_DATE

data class Search(
    var query: String = "",
    var order: String = ORDER_DATE,
    var dateRange: Int = DATE_RANGE_ANYTIME,
    var limit: Int = 20,
    var type: SearchType = SearchType.NORMAL,
    var userId: Int = -1,
    var uploaderId: Int = -1,
    var token: String,
    var color: String = "",
    var aspect: String = "",
    var extJpg: Boolean = true,
    var extPng: Boolean = true,
    var extGif: Boolean = true,
    var deniedTags: String = ""
)

enum class SearchType {
    NORMAL,
    FAVORITE,
    UPLOADED
}
