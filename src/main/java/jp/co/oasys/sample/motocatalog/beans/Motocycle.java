package jp.co.oasys.sample.motocatalog.beans;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * バイク
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Motocycle {
  
  // バイク番号
  private Integer motoNo;

  // バイク名
  private String motoName;

  // シート高
  private Integer seatHeight;

  // シリンダー
  private Integer cylinder;

  // 冷却
  private String cooling;

  // 価格
  private Integer price;

  // コメント
  private String comment;

  // ブランドID
  private Brand brand;

  // バージョン
  private Integer version;

  // 登録日時
  private LocalDateTime insDt;

  // 更新日時
  private LocalDateTime updDt;
}
