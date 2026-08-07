package com.withpersona.sdk2.inquiry.network.dto;

import android.graphics.Color;
import com.squareup.moshi.f;
import com.squareup.moshi.x;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/RgbaHexColorAdapter;", "", "<init>", "()V", "toJson", "", "rgba", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "fromJson", "(Ljava/lang/String;)Ljava/lang/Integer;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RgbaHexColorAdapter {
    public static final RgbaHexColorAdapter INSTANCE = new RgbaHexColorAdapter();

    private RgbaHexColorAdapter() {
    }

    @f
    @RgbaHexColor
    public final Integer fromJson(String rgba) {
        Long lA;
        s.k(rgba, "rgba");
        String upperCase = t.F1(rgba).toString().toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        String strT0 = t.T0(upperCase, "#");
        int length = strT0.length();
        if (length != 6) {
            if (length != 8 || (lA = t.A(strT0, 16)) == null) {
                return null;
            }
            long jLongValue = lA.longValue();
            return Integer.valueOf(Color.argb((int) (jLongValue & 255), (int) ((jLongValue >> 24) & 255), (int) ((jLongValue >> 16) & 255), (int) ((jLongValue >> 8) & 255)));
        }
        Integer numY = t.y(strT0, 16);
        if (numY == null) {
            return null;
        }
        int iIntValue = numY.intValue();
        return Integer.valueOf(Color.rgb((iIntValue >> 16) & 255, (iIntValue >> 8) & 255, iIntValue & 255));
    }

    @x
    public final String toJson(@RgbaHexColor Integer rgba) {
        throw new IllegalStateException("Should not be called");
    }
}
