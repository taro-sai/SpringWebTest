package hrn.test.validation;

import javax.validation.GroupSequence;

/**
 * @GroupSequence
 * 順番通りにエラー制御を行う。
 * @author TadahiroSaitoh
 * 参考HP
 * http://d.hatena.ne.jp/tatsu-no-toshigo/20131006/1381063716
 */
@GroupSequence({GroupOrder1.class, GroupOrder2.class})
public interface GroupOrder {

}
