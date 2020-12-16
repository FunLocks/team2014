package com.example.motyokoiapplication.ui

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.motyokoiapplication.R
import com.example.motyokoiapplication.ui.notifications.ListAdapter
import com.example.motyokoiapplication.ui.notifications.User


class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

//ユーザーリストでデーターを追加
        var UserList = arrayListOf<User>(
                User("伊藤　清英","itokiyo@fun.ac.jp","3階 325室"),
                User("伊藤　恵","kei@fun.ac.jp","3階 332室"),
                User("稲村　浩","inamura@fun.ac.jp","2階 225室"),
                User("ヴァランス・マイケル","michael@fun.ac.jp","5階 526室"),
                User("大澤　英一","osawa@fun.ac.jp","研究棟1階 605室"),
                User("大場　みち子","michiko@fun.ac.jp","2階 223室"),
                User("岡本　誠","maq@fun.ac.jp","2階 233室"),
                User("奥野　拓","okuno@fun.ac.jp","1階 124室"),
                User("加藤　浩仁","kkato@fun.ac.jp","研究棟1階 604室"),
                User("香取　勇一","katori@fun.ac.jp","1階 128室"),
                User("川口　聡","satoshi@fun.ac.jp","2階 234室"),
                User("川越　敏司","kawagoe@fun.ac.jp","4階 424室"),
                User("川嶋　稔夫","kawashima@fun.ac.jp","研究棟1階 603室"),
                User("姜　南圭","kang@fun.ac.jp","2階 231室"),
                User("木村　健一","kimura@fun.ac.jp","1階 131室"),
                User("齊藤　朝輝","saito@fun.ac.jp","研究棟1階 654室"),
                User("櫻沢　繁","sakura@fun.ac.jp","3階 334室"),
                User("佐々木　博昭","hsasaki@fun.ac.jp","4階 431室"),
                User("佐藤　生馬","ikuma-is@fun.ac.jp","2階 230室"),
                User("佐藤　直行","satonao@fun.ac.jp","2階 235室"),
                User("佐藤　仁樹","jamisato@fun.ac.jp","3階 323室"),
                User("姜　暁鴻","jiang@fun.ac.jp","2階 226室"),
                User("ジョンソン・アンドリュー","andy@fun.ac.jp","5階 529室"),
                User("白石　陽","siraisi@fun.ac.jp","3階 328室"),
                User("白勢　政明","shirase@fun.ac.jp","2階 229室"),
                User("鈴木　恵二","kjsuzuki@fun.ac.jp","3階 330室"),
                User("鈴木　昭二","ssuzuki@fun.ac.jp","研究棟1階 610室"),
                User("角　薫","kaorus@fun.ac.jp","2階 227室"),
                User("角　康之","sumi@fun.ac.jp","1階 126室"),
                User("スミス・アダム","adam@fun.ac.jp","5階 527室"),
                User("高木　清二","s-takagi@fun.ac.jp","3階 329室"),
                User("高橋　信行","ntakahas@fun.ac.jp","研究棟1階 655室"),
                User("竹川　佳成","yoshi@fun.ac.jp","1階 125室"),
                User("竹之内　高志","ttakashi@fun.ac.jp","4階 435室"),
                User("田中　吉太郎","y-tanaka@fun.ac.jp","4階 434室"),
                User("田柳　恵美子","tayanagi@fun.ac.jp","4階 425室"),
                User("塚田　浩二","tsuka@fun.ac.jp","1階 134室"),
                User("辻　義人","y-tsuji@fun.ac.jp","4階 428室"),
                User("寺井　あすか","aterai@fun.ac.jp","1階 130室"),
                User("寺沢　憲吾","kterasaw@fun.ac.jp","4階 423室"),
                User("富永　敦子","tominaga@fun.ac.jp","5階 525室"),
                User("中小路　久美代","kumiyo@fun.ac.jp","4階 429室"),
                User("長崎　健","nagasaki@fun.ac.jp","研究棟1階 601室"),
                User("中田　隆行","nakata@fun.ac.jp","3階 327室"),
                User("中村　美智子","m-naka@fun.ac.jp","5階 524室"),
                User("中村　嘉隆","y-nakamr@fun.ac.jp","2階 228室"),
                User("南部　美砂子","m-nambu@fun.ac.jp","3階 324室"),
                User("新美　礼彦","niimi@fun.ac.jp","研究棟2階 756室"),
                User("バゲンダ・ドミニク","bagenda@fun.ac.jp","5階 523室"),
                User("花田　光彦","hanada@fun.ac.jp","3階 333室"),
                User("原田　泰","haraday@fun.ac.jp","3階 331室"),
                User("平田　圭二","hirata@fun.ac.jp","1階 123室"),
                User("藤野　雄一","fujino@fun.ac.jp","2階 224室"),
                User("フランク・イアン","ianf@fun.ac.jp","研究棟1階 611室"),
                User("松原　克弥","matsu@fun.ac.jp","1階 127室"),
                User("松原　仁","matsubar@fun.ac.jp","研究棟1階 609室"),
                User("三上　貞芳","s_mikami@fun.ac.jp","研究棟1階 607室"),
                User("美馬　のゆり","noyuri@fun.ac.jp","3階 326室"),
                User("美馬　義亮","mima@fun.ac.jp","1階 132室"),
                User("宮本　エジソン　正","etm@fun.ac.jp","4階 426室"),
                User("迎山　和司","kazushi@fun.ac.jp","1階 133室"),
                User("村井　源","h_murai@fun.ac.jp","4階 433室"),
                User("安井　重哉","yasui@fun.ac.jp","1階 135室"),
                User("柳　英克","yanagi@fun.ac.jp","2階 232室"),
                User("由良　文孝","yura@fun.ac.jp","研究棟1階 656室"),
                User("リヴァーズ・ダミアン","rivers@fun.ac.jp","5階 522室"),
                User("リヤボフ・ウラジミール","riabov@fun.ac.jp","1階 129室"),
                User("ルースベン＝スチュアート・ピーター","stuart@fun.ac.jp","4階 427室"),
                User("和田　雅昭","wada@fun.ac.jp","4階 432室")
        )
        var list_view = findViewById<ListView>(R.id.list_view)
        //アダプターにユーザーリストを導入
        val Adapter = ListAdapter(this, UserList)
        //リストビューにアダプターを設定
        list_view.adapter = Adapter
    }
}