package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.views.text.c;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends c> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    private static final String TAG = "ReactTextAnchorViewManager";

    @no.a(name = "accessible")
    public void setAccessible(h hVar, boolean z11) {
        hVar.setFocusable(z11);
    }

    @no.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(h hVar, boolean z11) {
        hVar.setAdjustFontSizeToFit(z11);
    }

    @no.a(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(h hVar, String str) {
        if (str == null || str.equals("none")) {
            hVar.setHyphenationFrequency(0);
            return;
        }
        if (str.equals("full")) {
            hVar.setHyphenationFrequency(2);
            return;
        }
        if (str.equals("normal")) {
            hVar.setHyphenationFrequency(1);
            return;
        }
        qk.a.I("ReactNative", "Invalid android_hyphenationFrequency: " + str);
        hVar.setHyphenationFrequency(0);
    }

    @no.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(h hVar, int i11, Integer num) {
        com.facebook.react.uimanager.a.q(hVar, so.n.ALL, num);
    }

    @no.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(h hVar, int i11, float f11) {
        com.facebook.react.uimanager.a.r(hVar, so.d.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(f11, com.facebook.react.uimanager.p.POINT));
    }

    @no.a(name = "borderStyle")
    public void setBorderStyle(h hVar, String str) {
        com.facebook.react.uimanager.a.s(hVar, str == null ? null : so.f.fromString(str));
    }

    @no.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(h hVar, int i11, float f11) {
        com.facebook.react.uimanager.a.t(hVar, so.n.values()[i11], Float.valueOf(f11));
    }

    @no.a(name = "dataDetectorType")
    public void setDataDetectorType(h hVar, String str) {
        if (str != null) {
            switch (str) {
                case "phoneNumber":
                    hVar.setLinkifyMask(4);
                    break;
                case "all":
                    hVar.setLinkifyMask(15);
                    break;
                case "link":
                    hVar.setLinkifyMask(1);
                    break;
                case "email":
                    hVar.setLinkifyMask(2);
                    break;
            }
            return;
        }
        hVar.setLinkifyMask(0);
    }

    @no.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(h hVar, boolean z11) {
        hVar.setEnabled(!z11);
    }

    @no.a(name = "ellipsizeMode")
    public void setEllipsizeMode(h hVar, String str) {
        if (str == null || str.equals("tail")) {
            hVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
            return;
        }
        if (str.equals("head")) {
            hVar.setEllipsizeLocation(TextUtils.TruncateAt.START);
            return;
        }
        if (str.equals("middle")) {
            hVar.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
            return;
        }
        if (str.equals("clip")) {
            hVar.setEllipsizeLocation(null);
            return;
        }
        qk.a.I("ReactNative", "Invalid ellipsizeMode: " + str);
        hVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
    }

    @no.a(name = OrcaFlavourKeys.FONT_SIZE)
    public void setFontSize(h hVar, float f11) {
        hVar.setFontSize(f11);
    }

    @no.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(h hVar, boolean z11) {
        hVar.setIncludeFontPadding(z11);
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "letterSpacing")
    public void setLetterSpacing(h hVar, float f11) {
        hVar.setLetterSpacing(f11);
    }

    @no.a(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(h hVar, boolean z11) {
        hVar.setNotifyOnInlineViewLayout(z11);
    }

    @no.a(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(h hVar, int i11) {
        hVar.setNumberOfLines(i11);
    }

    @no.a(name = "selectable")
    public void setSelectable(h hVar, boolean z11) {
        hVar.setTextIsSelectable(z11);
    }

    @no.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(h hVar, Integer num) {
        if (num == null) {
            hVar.setHighlightColor(a.c(hVar.getContext()));
        } else {
            hVar.setHighlightColor(num.intValue());
        }
    }

    @no.a(name = "textAlignVertical")
    public void setTextAlignVertical(h hVar, String str) {
        if (str == null || DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str)) {
            hVar.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            hVar.setGravityVertical(48);
            return;
        }
        if ("bottom".equals(str)) {
            hVar.setGravityVertical(80);
            return;
        }
        if ("center".equals(str)) {
            hVar.setGravityVertical(16);
            return;
        }
        qk.a.I("ReactNative", "Invalid textAlignVertical: " + str);
        hVar.setGravityVertical(0);
    }
}
