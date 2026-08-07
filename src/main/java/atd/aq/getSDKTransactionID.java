package atd.aq;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import atd.av.getDeviceData;
import com.adyen.threeds2.R;
import com.adyen.threeds2.customization.ButtonCustomization;
import com.adyen.threeds2.customization.Customization;
import com.adyen.threeds2.customization.ExpandableInfoCustomization;
import com.adyen.threeds2.customization.LabelCustomization;
import com.adyen.threeds2.customization.ScreenCustomization;
import com.adyen.threeds2.customization.SelectionItemCustomization;
import com.adyen.threeds2.customization.TextBoxCustomization;
import com.adyen.threeds2.customization.ToolbarCustomization;
import com.adyen.threeds2.customization.UiCustomization;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKTransactionID {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData;
    private final UiCustomization getSDKAppID;

    /* JADX INFO: renamed from: atd.aq.getSDKTransactionID$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        private static int getDeviceData = 0;
        static final /* synthetic */ int[] getSDKReferenceNumber;
        private static int getSDKTransactionID = 1;

        static {
            int[] iArr = new int[getDeviceData.getSDKTransactionID.values().length];
            getSDKReferenceNumber = iArr;
            try {
                iArr[getDeviceData.getSDKTransactionID.HORIZONTAL.ordinal()] = 1;
                int i11 = getDeviceData;
                getSDKTransactionID = ((i11 & 111) + (i11 | 111)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getSDKReferenceNumber[getDeviceData.getSDKTransactionID.VERTICAL.ordinal()] = 2;
                int i12 = getDeviceData;
                int i13 = i12 & 13;
                getSDKTransactionID = ((((i12 ^ 13) | i13) << 1) - ((i12 | 13) & (~i13))) % 128;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public getSDKTransactionID(UiCustomization uiCustomization) {
        this.getSDKAppID = uiCustomization;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = getDeviceData;
        int i12 = i11 & 15;
        int i13 = (i11 | 15) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = (i13 & i14) + (i13 | i14);
        AuthenticationRequestParameters = i15 % 128;
        if (i15 % 2 == 0) {
            Customization.parseHexColorCode(str);
            throw null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(str);
        if (hexColorCode != null) {
            getdevicedata.setColor(hexColorCode.intValue());
            int i16 = AuthenticationRequestParameters;
            int i17 = i16 & 67;
            int i18 = ((i16 ^ 67) | i17) << 1;
            int i19 = -((i16 | 67) & (~i17));
            getDeviceData = ((i18 & i19) + (i19 | i18)) % 128;
        }
        if (iIntValue >= 0) {
            int i21 = ~iIntValue;
            int i22 = (-1949336585) & i21;
            int i23 = ((-1949336585) | i21) & (~i22);
            int i24 = ((i23 & i22) | (i23 ^ i22)) * 184;
            int i25 = ((((~i24) & 1050224681) | ((-1050224682) & i24)) - (~(-(-((i24 & 1050224681) << 1))))) - 1;
            int i26 = ~iIntValue;
            int i27 = ~((i26 & 198146807) | (i26 ^ 198146807));
            int i28 = ((i27 & 193753826) | (193753826 ^ i27) | (-2147483392)) * 184;
            int i29 = i25 & i28;
            int i31 = (i28 ^ i25) | i29;
            int i32 = (i29 & i31) + (i31 | i29);
            int i33 = (-672046247) & iIntValue;
            int i34 = (~i33) & ((-672046247) | iIntValue);
            int i35 = (i33 & i34) | (i34 ^ i33);
            int i36 = (i35 | (~i35)) & (~i35);
            int i37 = 701350006 - (((-1558965909) - (~(-(~(((i36 & 978478268) | (978478268 ^ i36)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))))) ^ (-1));
            int i38 = (-672046247) ^ i21;
            int i39 = i21 & (-672046247);
            int i41 = ~((i39 & i38) | (i38 ^ i39));
            int i42 = i41 & 307257368;
            int i43 = (i41 | 307257368) & (~i42);
            int i44 = (i43 & i42) | (i43 ^ i42);
            int i45 = i44 ^ 671220900;
            int i46 = i44 & 671220900;
            int i47 = ((i46 & i45) | (i45 ^ i46)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
            int i48 = i37 & i47;
            int i49 = (i47 ^ i37) | i48;
            if (i32 > (i48 ^ i49) + ((i49 & i48) << 1)) {
                int i51 = AnonymousClass4.getSDKReferenceNumber[((getDeviceData.getSDKTransactionID) getDeviceData.AuthenticationRequestParameters(new Object[]{getdevicedata}, -821502415, 821502419, System.identityHashCode(getdevicedata))).ordinal()];
                throw null;
            }
            int i52 = AnonymousClass4.getSDKReferenceNumber[((getDeviceData.getSDKTransactionID) getDeviceData.AuthenticationRequestParameters(new Object[]{getdevicedata}, -821502415, 821502419, System.identityHashCode(getdevicedata))).ordinal()];
            if (i52 == 1) {
                getdevicedata.setThickness(iIntValue);
                int i53 = AuthenticationRequestParameters;
                int i54 = i53 & 71;
                int i55 = i54 + ((i53 ^ 71) | i54);
                getDeviceData = i55 % 128;
                if (i55 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            if (i52 == 2) {
                getdevicedata.setThickness(iIntValue);
                int i56 = getDeviceData;
                int i57 = i56 & 91;
                int i58 = ((i56 ^ 91) | i57) << 1;
                int i59 = -((i56 | 91) & (~i57));
                AuthenticationRequestParameters = (((i58 | i59) << 1) - (i59 ^ i58)) % 128;
            }
        }
        int i61 = AuthenticationRequestParameters;
        int i62 = ((i61 ^ 3) | (i61 & 3)) << 1;
        int i63 = -(((~i61) & 3) | (i61 & (-4)));
        getDeviceData = (((i62 | i63) << 1) - (i63 ^ i62)) % 128;
        return null;
    }

    private static /* synthetic */ Object BuildConfig(Object[] objArr) {
        TextView textView = (TextView) objArr[0];
        Customization customization = (Customization) objArr[1];
        int i11 = getDeviceData;
        int i12 = i11 & 21;
        int i13 = -(-((i11 ^ 21) | i12));
        AuthenticationRequestParameters = (((i12 | i13) << 1) - (i12 ^ i13)) % 128;
        if (customization == null) {
            AuthenticationRequestParameters = (i11 + 79) % 128;
            return null;
        }
        String textColor = customization.getTextColor();
        String textFontName = customization.getTextFontName();
        int textFontSize = customization.getTextFontSize();
        getSDKTransactionID(new Object[]{textView, textColor, textFontName, Integer.valueOf(textFontSize)}, 1832034, -1832021, textFontSize);
        int i14 = getDeviceData;
        int i15 = (((i14 ^ 13) | (i14 & 13)) << 1) - (((~i14) & 13) | (i14 & (-14)));
        AuthenticationRequestParameters = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 74 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object ChallengeResult(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        Drawable drawable = (Drawable) objArr[1];
        Integer num = (Integer) objArr[2];
        while (drawable != null) {
            int i11 = AuthenticationRequestParameters;
            getDeviceData = (((i11 & (-22)) | ((~i11) & 21)) + ((i11 & 21) << 1)) % 128;
            if (num == null) {
                break;
            }
            int i12 = getDeviceData;
            int i13 = i12 & 103;
            int i14 = ((i12 ^ 103) | i13) << 1;
            int i15 = -((~i13) & (i12 | 103));
            int i16 = (((i14 | i15) << 1) - (i14 ^ i15)) % 128;
            AuthenticationRequestParameters = i16;
            if (drawable instanceof InsetDrawable) {
                int i17 = i12 & 27;
                int i18 = (i12 ^ 27) | i17;
                AuthenticationRequestParameters = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                getSDKTransactionID(new Object[]{getsdktransactionid, ((InsetDrawable) drawable).getDrawable(), num}, -1723561882, 1723561890, System.identityHashCode(getsdktransactionid));
                int i19 = AuthenticationRequestParameters;
                int i21 = i19 & 61;
                int i22 = (i19 ^ 61) | i21;
                getDeviceData = ((i21 & i22) + (i22 | i21)) % 128;
            } else if (drawable instanceof StateListDrawable) {
                int i23 = (i16 & 106) + (i16 | 106);
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                getDeviceData = i24 % 128;
                if (i24 % 2 != 0) {
                    throw null;
                }
                DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int i25 = AuthenticationRequestParameters;
                    getDeviceData = ((((i25 | 88) << 1) - (i25 ^ 88)) - 1) % 128;
                    int i26 = 0;
                    while (i26 < drawableContainerState.getChildren().length) {
                        int i27 = getDeviceData;
                        int i28 = i27 & 105;
                        AuthenticationRequestParameters = (((i27 | 105) & (~i28)) + (i28 << 1)) % 128;
                        getSDKTransactionID(new Object[]{getsdktransactionid, drawableContainerState.getChild(i26), num}, -1723561882, 1723561890, System.identityHashCode(getsdktransactionid));
                        i26++;
                        int i29 = AuthenticationRequestParameters;
                        int i31 = (i29 & (-68)) | ((~i29) & 67);
                        int i32 = -(-((i29 & 67) << 1));
                        getDeviceData = (((i31 | i32) << 1) - (i32 ^ i31)) % 128;
                    }
                }
                int i33 = getDeviceData;
                AuthenticationRequestParameters = ((-2) - (((i33 ^ 8) + ((i33 & 8) << 1)) ^ (-1))) % 128;
            } else if (drawable instanceof GradientDrawable) {
                int i34 = i16 & 41;
                int i35 = -(-((i16 ^ 41) | i34));
                getDeviceData = (((i34 | i35) << 1) - (i34 ^ i35)) % 128;
                ((GradientDrawable) drawable).setCornerRadius(num.intValue());
                int i36 = AuthenticationRequestParameters;
                int i37 = ((i36 ^ 99) | (i36 & 99)) << 1;
                int i38 = -(((~i36) & 99) | (i36 & (-100)));
                getDeviceData = (((i37 | i38) << 1) - (i38 ^ i37)) % 128;
            }
            int i39 = AuthenticationRequestParameters;
            int i41 = (((i39 ^ 82) + ((i39 & 82) << 1)) - 1) % 128;
            getDeviceData = i41;
            if (!(drawable instanceof RippleDrawable)) {
                int i42 = ((i41 ^ 105) | (i41 & 105)) << 1;
                int i43 = -((i41 & (-106)) | ((~i41) & 105));
                int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                AuthenticationRequestParameters = i44 % 128;
                if (i44 % 2 == 0) {
                    int i45 = 7 / 0;
                }
                return null;
            }
            int i46 = i39 & 51;
            int i47 = (i39 ^ 51) | i46;
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            getDeviceData = i48 % 128;
            if (i48 % 2 != 0) {
                ((RippleDrawable) drawable).getNumberOfLayers();
                throw null;
            }
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            if (rippleDrawable.getNumberOfLayers() > 0) {
                int i49 = getDeviceData;
                int i51 = ((((i49 ^ 85) | (i49 & 85)) << 1) - (~(-(((~i49) & 85) | (i49 & (-86)))))) - 1;
                AuthenticationRequestParameters = i51 % 128;
                drawable = i51 % 2 == 0 ? rippleDrawable.getDrawable(0) : rippleDrawable.getDrawable(0);
            } else {
                int i52 = AuthenticationRequestParameters;
                getDeviceData = (((i52 | 45) << 1) - (i52 ^ 45)) % 128;
                drawable = null;
            }
            int i53 = AuthenticationRequestParameters;
            int i54 = i53 ^ 63;
            getDeviceData = (((((i53 & 63) | i54) << 1) - (~(-i54))) - 1) % 128;
        }
        AuthenticationRequestParameters = (getDeviceData + 109) % 128;
        return null;
    }

    private static /* synthetic */ Object ChallengeResultCancelled(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        getDeviceData getdevicedata = (getDeviceData) objArr[1];
        getDeviceData = (AuthenticationRequestParameters + 95) % 128;
        int id2 = getdevicedata.getId();
        if (id2 == R.id.dividerView_info) {
            int i11 = AuthenticationRequestParameters + 121;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                getsdktransactionid.getSDKAppID.getExpandableInfoCustomization();
                throw null;
            }
            ExpandableInfoCustomization expandableInfoCustomization = getsdktransactionid.getSDKAppID.getExpandableInfoCustomization();
            if (expandableInfoCustomization != null) {
                int i12 = getDeviceData;
                int i13 = ((i12 | 89) << 1) - (i12 ^ 89);
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 == 0) {
                    String borderColor = expandableInfoCustomization.getBorderColor();
                    int borderWidth = expandableInfoCustomization.getBorderWidth();
                    getSDKTransactionID(new Object[]{getdevicedata, borderColor, Integer.valueOf(borderWidth)}, -1769891804, 1769891805, borderWidth);
                    throw null;
                }
                String borderColor2 = expandableInfoCustomization.getBorderColor();
                int borderWidth2 = expandableInfoCustomization.getBorderWidth();
                getSDKTransactionID(new Object[]{getdevicedata, borderColor2, Integer.valueOf(borderWidth2)}, -1769891804, 1769891805, borderWidth2);
            }
            int i14 = getDeviceData;
            int i15 = i14 & 37;
            int i16 = ((i14 ^ 37) | i15) << 1;
            int i17 = -((i14 | 37) & (~i15));
            AuthenticationRequestParameters = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
            return null;
        }
        if (id2 == R.id.dividerView_select) {
            int i18 = AuthenticationRequestParameters;
            int i19 = i18 ^ 77;
            int i21 = ((i18 & 77) | i19) << 1;
            int i22 = -i19;
            getDeviceData = ((i21 ^ i22) + ((i21 & i22) << 1)) % 128;
            SelectionItemCustomization selectionItemCustomization = getsdktransactionid.getSDKAppID.getSelectionItemCustomization();
            if (selectionItemCustomization != null) {
                int i23 = getDeviceData;
                AuthenticationRequestParameters = (((i23 & 29) - (~(i23 | 29))) - 1) % 128;
                String borderColor3 = selectionItemCustomization.getBorderColor();
                int borderWidth3 = selectionItemCustomization.getBorderWidth();
                getSDKTransactionID(new Object[]{getdevicedata, borderColor3, Integer.valueOf(borderWidth3)}, -1769891804, 1769891805, borderWidth3);
                int i24 = AuthenticationRequestParameters;
                getDeviceData = ((((i24 | 53) << 1) - (~(-(((~i24) & 53) | (i24 & (-54)))))) - 1) % 128;
            }
            int i25 = getDeviceData + 41;
            AuthenticationRequestParameters = i25 % 128;
            if (i25 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (id2 == R.id.dividerView_logos) {
            int i26 = AuthenticationRequestParameters;
            int i27 = i26 & 43;
            int i28 = i27 + ((i26 ^ 43) | i27);
            getDeviceData = i28 % 128;
            if (i28 % 2 != 0) {
                getsdktransactionid.getSDKAppID.getExpandableInfoCustomization();
                throw null;
            }
            ExpandableInfoCustomization expandableInfoCustomization2 = getsdktransactionid.getSDKAppID.getExpandableInfoCustomization();
            if (expandableInfoCustomization2 != null) {
                getDeviceData = ((-2) - ((AuthenticationRequestParameters + 62) ^ (-1))) % 128;
                String borderColor4 = expandableInfoCustomization2.getBorderColor();
                int borderWidth4 = expandableInfoCustomization2.getBorderWidth();
                getSDKTransactionID(new Object[]{getdevicedata, borderColor4, Integer.valueOf(borderWidth4)}, -1769891804, 1769891805, borderWidth4);
                int i29 = AuthenticationRequestParameters;
                int i31 = i29 & 51;
                int i32 = (i29 | 51) & (~i31);
                int i33 = -(-(i31 << 1));
                getDeviceData = ((i32 ^ i33) + ((i32 & i33) << 1)) % 128;
            }
        }
        int i34 = AuthenticationRequestParameters;
        int i35 = i34 ^ 15;
        int i36 = (i34 & 15) << 1;
        int i37 = (i35 & i36) + (i36 | i35);
        getDeviceData = i37 % 128;
        if (i37 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object ChallengeResultCompleted(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 + 38;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        getDeviceData = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_SelectItem) {
            int i14 = i11 & 39;
            getDeviceData = ((((i11 | 39) & (~i14)) - (~(-(-(i14 << 1))))) - 1) % 128;
            SelectionItemCustomization selectionItemCustomization = getsdktransactionid.getSDKAppID.getSelectionItemCustomization();
            if (selectionItemCustomization == null) {
                int i15 = AuthenticationRequestParameters;
                getDeviceData = (((i15 & 125) - (~(-(-(i15 | 125))))) - 1) % 128;
                return null;
            }
            Integer hexColorCode = Customization.parseHexColorCode(selectionItemCustomization.getHighlightedBackgroundColor());
            if (hexColorCode != null) {
                int i16 = AuthenticationRequestParameters;
                int i17 = i16 & 15;
                int i18 = -(-((i16 ^ 15) | i17));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                getDeviceData = i19 % 128;
                if (i19 % 2 != 0) {
                    getSDKTransactionID(new Object[]{getsdktransactionid, view.getBackground(), hexColorCode, Boolean.TRUE}, -2025566395, 2025566398, System.identityHashCode(getsdktransactionid));
                } else {
                    getSDKTransactionID(new Object[]{getsdktransactionid, view.getBackground(), hexColorCode, Boolean.TRUE}, -2025566395, 2025566398, System.identityHashCode(getsdktransactionid));
                }
                int i21 = getDeviceData;
                int i22 = i21 & 65;
                int i23 = -(-(i21 | 65));
                AuthenticationRequestParameters = ((i22 & i23) + (i23 | i22)) % 128;
            }
        }
        int i24 = AuthenticationRequestParameters;
        int i25 = i24 & 25;
        int i26 = (i25 - (~((i24 ^ 25) | i25))) - 1;
        getDeviceData = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 65 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object ChallengeResultError(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        ProgressBar progressBar = (ProgressBar) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 | 99) << 1;
        int i13 = -(((~i11) & 99) | (i11 & (-100)));
        int i14 = (i12 & i13) + (i13 | i12);
        int i15 = i14 % 128;
        getDeviceData = i15;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_ProgressBar) {
            AuthenticationRequestParameters = ((((i15 | 25) << 1) - (~(-(((~i15) & 25) | (i15 & (-26)))))) - 1) % 128;
            ToolbarCustomization toolbarCustomization = getsdktransactionid.getSDKAppID.getToolbarCustomization();
            if (toolbarCustomization == null) {
                int i16 = getDeviceData;
                int i17 = i16 & 85;
                int i18 = i17 + ((i16 ^ 85) | i17);
                AuthenticationRequestParameters = i18 % 128;
                if (i18 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            Integer hexColorCode = Customization.parseHexColorCode(toolbarCustomization.getBackgroundColor());
            if (hexColorCode != null) {
                int i19 = AuthenticationRequestParameters;
                int i21 = (i19 | 37) << 1;
                int i22 = -(((~i19) & 37) | (i19 & (-38)));
                int i23 = (i21 & i22) + (i22 | i21);
                getDeviceData = i23 % 128;
                if (i23 % 2 != 0) {
                    getSDKTransactionID(new Object[]{getsdktransactionid, progressBar.getIndeterminateDrawable(), hexColorCode}, -94988286, 94988302, System.identityHashCode(getsdktransactionid));
                    int i24 = 48 / 0;
                } else {
                    getSDKTransactionID(new Object[]{getsdktransactionid, progressBar.getIndeterminateDrawable(), hexColorCode}, -94988286, 94988302, System.identityHashCode(getsdktransactionid));
                }
                int i25 = AuthenticationRequestParameters;
                getDeviceData = (((i25 ^ 80) + ((i25 & 80) << 1)) - 1) % 128;
            }
        }
        getDeviceData = (AuthenticationRequestParameters + 117) % 128;
        return null;
    }

    private static /* synthetic */ Object ChallengeResultKt(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        TextView textView = (TextView) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 + 75) % 128;
        getDeviceData = i12;
        if (iIntValue == R.style.TextAppearance_ThreeDS2_Widget_Toolbar_Title) {
            getDeviceData = ((((i11 | 124) << 1) - (i11 ^ 124)) - 1) % 128;
            getSDKTransactionID(new Object[]{textView, getsdktransactionid.getSDKAppID.getToolbarCustomization()}, -2026149408, 2026149417, (int) System.currentTimeMillis());
            int i13 = getDeviceData;
            int i14 = (i13 & (-18)) | ((~i13) & 17);
            int i15 = -(-((i13 & 17) << 1));
            AuthenticationRequestParameters = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
            return null;
        }
        if (iIntValue == R.style.TextAppearance_ThreeDS2_Heading) {
            int i16 = i12 & 125;
            int i17 = (((~i16) & (i12 | 125)) - (~(-(-(i16 << 1))))) - 1;
            AuthenticationRequestParameters = i17 % 128;
            if (i17 % 2 == 0) {
                LabelCustomization labelCustomization = getsdktransactionid.getSDKAppID.getLabelCustomization();
                String headingTextColor = labelCustomization.getHeadingTextColor();
                String headingTextFontName = labelCustomization.getHeadingTextFontName();
                int headingTextFontSize = labelCustomization.getHeadingTextFontSize();
                getSDKTransactionID(new Object[]{textView, headingTextColor, headingTextFontName, Integer.valueOf(headingTextFontSize)}, 1832034, -1832021, headingTextFontSize);
                int i18 = 40 / 0;
            } else {
                LabelCustomization labelCustomization2 = getsdktransactionid.getSDKAppID.getLabelCustomization();
                String headingTextColor2 = labelCustomization2.getHeadingTextColor();
                String headingTextFontName2 = labelCustomization2.getHeadingTextFontName();
                int headingTextFontSize2 = labelCustomization2.getHeadingTextFontSize();
                getSDKTransactionID(new Object[]{textView, headingTextColor2, headingTextFontName2, Integer.valueOf(headingTextFontSize2)}, 1832034, -1832021, headingTextFontSize2);
            }
            return null;
        }
        if (iIntValue == R.style.TextAppearance_ThreeDS2_InputLabel) {
            AuthenticationRequestParameters = ((i12 & 69) + (i12 | 69)) % 128;
            LabelCustomization labelCustomization3 = getsdktransactionid.getSDKAppID.getLabelCustomization();
            String inputLabelTextColor = labelCustomization3.getInputLabelTextColor();
            String inputLabelTextFontName = labelCustomization3.getInputLabelTextFontName();
            int inputLabelTextFontSize = labelCustomization3.getInputLabelTextFontSize();
            getSDKTransactionID(new Object[]{textView, inputLabelTextColor, inputLabelTextFontName, Integer.valueOf(inputLabelTextFontSize)}, 1832034, -1832021, inputLabelTextFontSize);
            int i19 = getDeviceData + 16;
            AuthenticationRequestParameters = ((i19 ^ (-1)) + (i19 << 1)) % 128;
            return null;
        }
        if (iIntValue == R.style.TextAppearance_ThreeDS2_SelectItem_Title) {
            getDeviceData = ((i11 & 53) + (i11 | 53)) % 128;
            getSDKTransactionID(new Object[]{textView, getsdktransactionid.getSDKAppID.getSelectionItemCustomization()}, -2026149408, 2026149417, (int) System.currentTimeMillis());
            int i21 = getDeviceData;
            int i22 = i21 ^ 87;
            int i23 = ((((i21 & 87) | i22) << 1) - (~(-i22))) - 1;
            AuthenticationRequestParameters = i23 % 128;
            if (i23 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (iIntValue != R.style.TextAppearance_ThreeDS2_Widget_ExpandableInfoText_Title) {
            if (iIntValue != R.style.TextAppearance_ThreeDS2_Widget_ExpandableInfoText_Info) {
                getSDKTransactionID(new Object[]{textView, getsdktransactionid.getSDKAppID.getLabelCustomization()}, -2026149408, 2026149417, (int) System.currentTimeMillis());
                int i24 = AuthenticationRequestParameters;
                int i25 = i24 & 59;
                int i26 = (i24 | 59) & (~i25);
                int i27 = i25 << 1;
                getDeviceData = ((i26 ^ i27) + ((i26 & i27) << 1)) % 128;
                return null;
            }
            int i28 = i12 & 119;
            int i29 = (((~i28) & (i12 | 119)) - (~(-(-(i28 << 1))))) - 1;
            AuthenticationRequestParameters = i29 % 128;
            if (i29 % 2 == 0) {
                getSDKTransactionID(new Object[]{textView, getsdktransactionid.getSDKAppID.getExpandableInfoCustomization()}, -2026149408, 2026149417, (int) System.currentTimeMillis());
                throw null;
            }
            getSDKTransactionID(new Object[]{textView, getsdktransactionid.getSDKAppID.getExpandableInfoCustomization()}, -2026149408, 2026149417, (int) System.currentTimeMillis());
            int i31 = AuthenticationRequestParameters;
            getDeviceData = ((i31 & 99) + (i31 | 99)) % 128;
            return null;
        }
        int i32 = i12 + 23;
        AuthenticationRequestParameters = i32 % 128;
        if (i32 % 2 == 0) {
            ExpandableInfoCustomization expandableInfoCustomization = getsdktransactionid.getSDKAppID.getExpandableInfoCustomization();
            String headingTextColor3 = expandableInfoCustomization.getHeadingTextColor();
            String headingTextFontName3 = expandableInfoCustomization.getHeadingTextFontName();
            int headingTextFontSize3 = expandableInfoCustomization.getHeadingTextFontSize();
            getSDKTransactionID(new Object[]{textView, headingTextColor3, headingTextFontName3, Integer.valueOf(headingTextFontSize3)}, 1832034, -1832021, headingTextFontSize3);
            throw null;
        }
        ExpandableInfoCustomization expandableInfoCustomization2 = getsdktransactionid.getSDKAppID.getExpandableInfoCustomization();
        String headingTextColor4 = expandableInfoCustomization2.getHeadingTextColor();
        String headingTextFontName4 = expandableInfoCustomization2.getHeadingTextFontName();
        int headingTextFontSize4 = expandableInfoCustomization2.getHeadingTextFontSize();
        getSDKTransactionID(new Object[]{textView, headingTextColor4, headingTextFontName4, Integer.valueOf(headingTextFontSize4)}, 1832034, -1832021, headingTextFontSize4);
        int i33 = AuthenticationRequestParameters;
        int i34 = (i33 & 105) + (i33 | 105);
        getDeviceData = i34 % 128;
        if (i34 % 2 != 0) {
            int i35 = 7 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object ChallengeResultTimeout(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        Window window = (Window) objArr[1];
        int i11 = getDeviceData;
        int i12 = (i11 & 100) + (i11 | 100);
        AuthenticationRequestParameters = ((i12 ^ (-1)) + (i12 << 1)) % 128;
        UiCustomization uiCustomization = getsdktransactionid.getSDKAppID;
        if (uiCustomization == null) {
            AuthenticationRequestParameters = (((i11 & (-48)) | ((~i11) & 47)) + ((i11 & 47) << 1)) % 128;
            return null;
        }
        ScreenCustomization screenCustomization = uiCustomization.getScreenCustomization();
        if (screenCustomization == null) {
            AuthenticationRequestParameters = (getDeviceData + 45) % 128;
            return null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(screenCustomization.getBackgroundColor());
        if (hexColorCode != null) {
            ColorDrawable colorDrawable = new ColorDrawable(hexColorCode.intValue());
            getDeviceData = (AuthenticationRequestParameters + 79) % 128;
            colorDrawable.setTint(hexColorCode.intValue());
            getDeviceData = (AuthenticationRequestParameters + 115) % 128;
            window.setBackgroundDrawable(colorDrawable);
            int i13 = AuthenticationRequestParameters;
            int i14 = i13 & 121;
            int i15 = -(-(i13 | 121));
            getDeviceData = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
        }
        int i16 = getDeviceData;
        AuthenticationRequestParameters = (((i16 & (-108)) | ((~i16) & 107)) + ((i16 & 107) << 1)) % 128;
        Integer hexColorCode2 = Customization.parseHexColorCode(screenCustomization.getStatusBarColor());
        if (hexColorCode2 != null) {
            int i17 = getDeviceData;
            int i18 = (i17 ^ 109) + ((i17 & 109) << 1);
            AuthenticationRequestParameters = i18 % 128;
            if (i18 % 2 == 0) {
                window.setStatusBarColor(hexColorCode2.intValue());
                int i19 = 6 / 0;
            } else {
                window.setStatusBarColor(hexColorCode2.intValue());
            }
        }
        int i21 = AuthenticationRequestParameters;
        int i22 = ((i21 | 59) << 1) - (i21 ^ 59);
        getDeviceData = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 40 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object ChallengeStatusHandler(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        Button button = (Button) objArr[1];
        ButtonCustomization buttonCustomization = (ButtonCustomization) objArr[2];
        int i11 = getDeviceData + 83;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            buttonCustomization.getCornerRadius();
            throw null;
        }
        int cornerRadius = buttonCustomization.getCornerRadius();
        if (cornerRadius >= 0) {
            int i12 = AuthenticationRequestParameters + 22;
            getDeviceData = ((i12 ^ (-1)) + (i12 << 1)) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, button.getBackground(), Integer.valueOf(cornerRadius)}, -1723561882, 1723561890, System.identityHashCode(getsdktransactionid));
            getDeviceData = (AuthenticationRequestParameters + 55) % 128;
        }
        getSDKTransactionID(new Object[]{button, buttonCustomization}, -2026149408, 2026149417, (int) System.currentTimeMillis());
        int i13 = getDeviceData;
        int i14 = (i13 & 8) + (i13 | 8);
        AuthenticationRequestParameters = ((i14 ^ (-1)) + (i14 << 1)) % 128;
        return null;
    }

    private static /* synthetic */ Object ChallengeStatusReceiver(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        Button button = (Button) objArr[1];
        ButtonCustomization buttonCustomization = (ButtonCustomization) objArr[2];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 35;
        int i13 = i11 | 35;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        getDeviceData = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (buttonCustomization == null) {
            int i15 = (i11 ^ 108) + ((i11 & 108) << 1);
            getDeviceData = ((i15 ^ (-1)) + (i15 << 1)) % 128;
            return null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(buttonCustomization.getBackgroundColor());
        if (hexColorCode != null) {
            int i16 = AuthenticationRequestParameters;
            int i17 = i16 ^ 77;
            int i18 = (i16 & 77) << 1;
            getDeviceData = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, button.getBackground(), hexColorCode, Boolean.TRUE}, -2025566395, 2025566398, System.identityHashCode(getsdktransactionid));
            int i19 = getDeviceData;
            AuthenticationRequestParameters = ((((i19 | 52) << 1) - (i19 ^ 52)) - 1) % 128;
        }
        getSDKTransactionID(new Object[]{getsdktransactionid, button, buttonCustomization}, 348437345, -348437330, System.identityHashCode(getsdktransactionid));
        int i21 = getDeviceData;
        int i22 = ((i21 ^ 94) + ((i21 & 94) << 1)) - 1;
        AuthenticationRequestParameters = i22 % 128;
        if (i22 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void cN_(ProgressBar progressBar, int i11) {
        getSDKTransactionID(new Object[]{this, progressBar, Integer.valueOf(i11)}, 927330354, -927330343, i11);
    }

    private void cO_(CompoundButton compoundButton) {
        getSDKTransactionID(new Object[]{this, compoundButton}, -131516609, 131516623, System.identityHashCode(this));
    }

    private void cP_(Button button, int i11) {
        getSDKTransactionID(new Object[]{this, button, Integer.valueOf(i11)}, -1173183212, 1173183218, i11);
    }

    private void cQ_(Button button, ButtonCustomization buttonCustomization) {
        getSDKTransactionID(new Object[]{this, button, buttonCustomization}, -1904135933, 1904135937, System.identityHashCode(this));
    }

    private void cR_(Button button, ButtonCustomization buttonCustomization) {
        getSDKTransactionID(new Object[]{this, button, buttonCustomization}, -886362980, 886362999, System.identityHashCode(this));
    }

    private void cS_(Button button, ButtonCustomization buttonCustomization) {
        getSDKTransactionID(new Object[]{this, button, buttonCustomization}, 348437345, -348437330, System.identityHashCode(this));
    }

    private void cT_(EditText editText) {
        getSDKTransactionID(new Object[]{this, editText}, 1312746890, -1312746890, System.identityHashCode(this));
    }

    private void cU_(TextView textView, int i11) {
        getSDKTransactionID(new Object[]{this, textView, Integer.valueOf(i11)}, 1811615328, -1811615310, i11);
    }

    private static void cV_(TextView textView, Customization customization) {
        getSDKTransactionID(new Object[]{textView, customization}, -2026149408, 2026149417, (int) System.currentTimeMillis());
    }

    private static void cW_(TextView textView, String str, String str2, int i11) {
        getSDKTransactionID(new Object[]{textView, str, str2, Integer.valueOf(i11)}, 1832034, -1832021, i11);
    }

    private void cX_(Drawable drawable, Integer num) {
        getSDKTransactionID(new Object[]{this, drawable, num}, -94988286, 94988302, System.identityHashCode(this));
    }

    private void cY_(Drawable drawable, Integer num, boolean z11) {
        getSDKTransactionID(new Object[]{this, drawable, num, Boolean.valueOf(z11)}, -2025566395, 2025566398, System.identityHashCode(this));
    }

    private void cZ_(Drawable drawable, Integer num) {
        getSDKTransactionID(new Object[]{this, drawable, num}, -1723561882, 1723561890, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getAdditionalDetails(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        CompoundButton compoundButton = (CompoundButton) objArr[1];
        int i11 = AuthenticationRequestParameters + 13;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            getsdktransactionid.getSDKAppID.getSelectionItemCustomization();
            throw null;
        }
        SelectionItemCustomization selectionItemCustomization = getsdktransactionid.getSDKAppID.getSelectionItemCustomization();
        if (selectionItemCustomization == null) {
            int i12 = getDeviceData;
            AuthenticationRequestParameters = (((i12 | 47) << 1) - (i12 ^ 47)) % 128;
            return null;
        }
        int i13 = AuthenticationRequestParameters;
        getDeviceData = (((i13 & 123) - (~(-(-(i13 | 123))))) - 1) % 128;
        Integer hexColorCode = Customization.parseHexColorCode(selectionItemCustomization.getSelectionIndicatorTintColor());
        if (hexColorCode != null) {
            int i14 = AuthenticationRequestParameters;
            int i15 = ((i14 & 104) + (i14 | 104)) - 1;
            getDeviceData = i15 % 128;
            if (i15 % 2 != 0) {
                compoundButton.setButtonTintList(ColorStateList.valueOf(hexColorCode.intValue()));
                int i16 = 86 / 0;
            } else {
                compoundButton.setButtonTintList(ColorStateList.valueOf(hexColorCode.intValue()));
            }
            getDeviceData = (AuthenticationRequestParameters + 125) % 128;
        }
        int i17 = getDeviceData;
        int i18 = ((i17 ^ 59) | (i17 & 59)) << 1;
        int i19 = -(((~i17) & 59) | (i17 & (-60)));
        int i21 = (i18 & i19) + (i19 | i18);
        AuthenticationRequestParameters = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 50 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        Drawable drawable;
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        Drawable drawable2 = (Drawable) objArr[1];
        Integer num = (Integer) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i11 = getDeviceData;
        int i12 = (((i11 | 117) << 1) - (i11 ^ 117)) % 128;
        AuthenticationRequestParameters = i12;
        if (drawable2 != null) {
            int i13 = i12 & 77;
            int i14 = (i12 | 77) & (~i13);
            int i15 = i13 << 1;
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            getDeviceData = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            if (num != null) {
                int i17 = AuthenticationRequestParameters;
                int i18 = i17 & 83;
                int i19 = i18 + ((i17 ^ 83) | i18);
                int i21 = i19 % 128;
                getDeviceData = i21;
                if (i19 % 2 != 0) {
                    throw null;
                }
                if (drawable2 instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) drawable2;
                    if (zBooleanValue) {
                        int i22 = i21 + 113;
                        AuthenticationRequestParameters = i22 % 128;
                        if (i22 % 2 == 0) {
                            rippleDrawable.setColor(ColorStateList.valueOf(num.intValue()));
                            throw null;
                        }
                        rippleDrawable.setColor(ColorStateList.valueOf(num.intValue()));
                        int i23 = getDeviceData;
                        int i24 = i23 & 69;
                        AuthenticationRequestParameters = (i24 + ((i23 ^ 69) | i24)) % 128;
                    }
                    if (rippleDrawable.getNumberOfLayers() > 0) {
                        int i25 = getDeviceData;
                        int i26 = (i25 & (-82)) | ((~i25) & 81);
                        int i27 = -(-((i25 & 81) << 1));
                        AuthenticationRequestParameters = ((i26 ^ i27) + ((i27 & i26) << 1)) % 128;
                        drawable = rippleDrawable.getDrawable(0);
                        int i28 = getDeviceData;
                        int i29 = i28 & 25;
                        int i31 = (i28 ^ 25) | i29;
                        AuthenticationRequestParameters = ((i29 & i31) + (i31 | i29)) % 128;
                    } else {
                        getDeviceData = (AuthenticationRequestParameters + 43) % 128;
                        drawable = null;
                    }
                    getSDKTransactionID(new Object[]{getsdktransactionid, drawable, num}, -94988286, 94988302, System.identityHashCode(getsdktransactionid));
                    int i32 = getDeviceData;
                    int i33 = i32 & 115;
                    int i34 = -(-((i32 ^ 115) | i33));
                    AuthenticationRequestParameters = ((i33 & i34) + (i34 | i33)) % 128;
                    return null;
                }
                if (drawable2 instanceof InsetDrawable) {
                    int i35 = (((i21 & (-40)) | ((~i21) & 39)) - (~((i21 & 39) << 1))) - 1;
                    AuthenticationRequestParameters = i35 % 128;
                    if (i35 % 2 == 0) {
                        getSDKTransactionID(new Object[]{getsdktransactionid, ((InsetDrawable) drawable2).getDrawable(), num}, -94988286, 94988302, System.identityHashCode(getsdktransactionid));
                        int i36 = 4 / 0;
                    } else {
                        getSDKTransactionID(new Object[]{getsdktransactionid, ((InsetDrawable) drawable2).getDrawable(), num}, -94988286, 94988302, System.identityHashCode(getsdktransactionid));
                    }
                    return null;
                }
                if (!(drawable2 instanceof ColorDrawable)) {
                    drawable2.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                    int i37 = getDeviceData;
                    int i38 = i37 & 11;
                    int i39 = (i37 ^ 11) | i38;
                    int i41 = ((i38 | i39) << 1) - (i39 ^ i38);
                    AuthenticationRequestParameters = i41 % 128;
                    if (i41 % 2 == 0) {
                        int i42 = 59 / 0;
                    }
                    return null;
                }
                int i43 = i21 & 49;
                int i44 = (~i43) & (i21 | 49);
                int i45 = -(-(i43 << 1));
                AuthenticationRequestParameters = (((i44 | i45) << 1) - (i45 ^ i44)) % 128;
                ColorDrawable colorDrawable = (ColorDrawable) drawable2;
                colorDrawable.setTint(num.intValue());
                colorDrawable.setColor(num.intValue());
                int i46 = AuthenticationRequestParameters;
                int i47 = ((i46 & 102) + (i46 | 102)) - 1;
                getDeviceData = i47 % 128;
                if (i47 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        int i48 = getDeviceData;
        int i49 = i48 & 47;
        AuthenticationRequestParameters = ((((i48 ^ 47) | i49) << 1) - ((i48 | 47) & (~i49))) % 128;
        return null;
    }

    private static /* synthetic */ Object getMessageVersion(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        Button button = (Button) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 & (-44)) | ((~i11) & 43);
        int i13 = (i11 & 43) << 1;
        int i14 = (((i12 | i13) << 1) - (i12 ^ i13)) % 128;
        getDeviceData = i14;
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Borderless_Cancel) {
            int i15 = i11 & 77;
            getDeviceData = ((((i11 ^ 77) | i15) << 1) - ((~i15) & (i11 | 77))) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, button, getsdktransactionid.getSDKAppID.getButtonCustomization(UiCustomization.ButtonType.CANCEL)}, -886362980, 886362999, System.identityHashCode(getsdktransactionid));
            int i16 = AuthenticationRequestParameters;
            int i17 = i16 & 19;
            int i18 = (i16 | 19) & (~i17);
            int i19 = -(-(i17 << 1));
            getDeviceData = ((i18 & i19) + (i18 | i19)) % 128;
            return null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Borderless_Resend) {
            int i21 = i14 + 37;
            AuthenticationRequestParameters = i21 % 128;
            if (i21 % 2 == 0) {
                getSDKTransactionID(new Object[]{getsdktransactionid, button, getsdktransactionid.getSDKAppID.getButtonCustomization(UiCustomization.ButtonType.RESEND)}, -886362980, 886362999, System.identityHashCode(getsdktransactionid));
                int i22 = 11 / 0;
            } else {
                getSDKTransactionID(new Object[]{getsdktransactionid, button, getsdktransactionid.getSDKAppID.getButtonCustomization(UiCustomization.ButtonType.RESEND)}, -886362980, 886362999, System.identityHashCode(getsdktransactionid));
            }
            return null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Colored_Verify) {
            int i23 = i14 + 85;
            AuthenticationRequestParameters = i23 % 128;
            if (i23 % 2 != 0) {
                getSDKTransactionID(new Object[]{getsdktransactionid, button, getsdktransactionid.getSDKAppID.getButtonCustomization(UiCustomization.ButtonType.VERIFY)}, -1904135933, 1904135937, System.identityHashCode(getsdktransactionid));
                return null;
            }
            getSDKTransactionID(new Object[]{getsdktransactionid, button, getsdktransactionid.getSDKAppID.getButtonCustomization(UiCustomization.ButtonType.VERIFY)}, -1904135933, 1904135937, System.identityHashCode(getsdktransactionid));
            throw null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Colored_Continue) {
            AuthenticationRequestParameters = (((i14 ^ 26) + ((i14 & 26) << 1)) - 1) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, button, getsdktransactionid.getSDKAppID.getButtonCustomization(UiCustomization.ButtonType.CONTINUE)}, -1904135933, 1904135937, System.identityHashCode(getsdktransactionid));
            getDeviceData = (AuthenticationRequestParameters + 73) % 128;
            return null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Colored_Next) {
            getDeviceData = ((((i11 | 10) << 1) - (i11 ^ 10)) - 1) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, button, getsdktransactionid.getSDKAppID.getButtonCustomization(UiCustomization.ButtonType.NEXT)}, -1904135933, 1904135937, System.identityHashCode(getsdktransactionid));
            AuthenticationRequestParameters = (getDeviceData + 19) % 128;
            return null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Borderless_OutOfBand) {
            getDeviceData = (i11 + 65) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, button, getsdktransactionid.getSDKAppID.getButtonCustomization(UiCustomization.ButtonType.OPEN_OOB_APP)}, -1904135933, 1904135937, System.identityHashCode(getsdktransactionid));
            int i24 = AuthenticationRequestParameters;
            int i25 = (i24 & (-16)) | ((~i24) & 15);
            int i26 = -(-((i24 & 15) << 1));
            getDeviceData = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
        }
        int i27 = AuthenticationRequestParameters;
        int i28 = i27 ^ 3;
        int i29 = (i27 & 3) << 1;
        getDeviceData = (((i28 | i29) << 1) - (i29 ^ i28)) % 128;
        return null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        View view = (View) objArr[1];
        AttributeSet attributeSet = (AttributeSet) objArr[2];
        int i11 = AuthenticationRequestParameters;
        getDeviceData = ((((i11 ^ 31) | (i11 & 31)) << 1) - ((i11 & (-32)) | ((~i11) & 31))) % 128;
        if (getsdktransactionid.getSDKAppID == null) {
            int i12 = (((i11 | 50) << 1) - (i11 ^ 50)) - 1;
            getDeviceData = i12 % 128;
            if (i12 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int styleAttribute = attributeSet.getStyleAttribute();
        if (view instanceof ProgressBar) {
            int i13 = getDeviceData + 53;
            AuthenticationRequestParameters = i13 % 128;
            if (i13 % 2 == 0) {
                getSDKTransactionID(new Object[]{getsdktransactionid, (ProgressBar) view, Integer.valueOf(styleAttribute)}, 927330354, -927330343, styleAttribute);
                throw null;
            }
            getSDKTransactionID(new Object[]{getsdktransactionid, (ProgressBar) view, Integer.valueOf(styleAttribute)}, 927330354, -927330343, styleAttribute);
            getDeviceData = (AuthenticationRequestParameters + 33) % 128;
            return null;
        }
        if (view instanceof CompoundButton) {
            int i14 = getDeviceData;
            int i15 = i14 & 75;
            int i16 = ((i14 ^ 75) | i15) << 1;
            int i17 = -((i14 | 75) & (~i15));
            int i18 = (i16 & i17) + (i17 | i16);
            AuthenticationRequestParameters = i18 % 128;
            if (i18 % 2 == 0) {
                getSDKTransactionID(new Object[]{getsdktransactionid, (CompoundButton) view}, -131516609, 131516623, System.identityHashCode(getsdktransactionid));
                int i19 = 44 / 0;
            } else {
                getSDKTransactionID(new Object[]{getsdktransactionid, (CompoundButton) view}, -131516609, 131516623, System.identityHashCode(getsdktransactionid));
            }
            int i21 = AuthenticationRequestParameters;
            getDeviceData = (((i21 | 85) << 1) - (i21 ^ 85)) % 128;
            return null;
        }
        if (view instanceof Button) {
            int i22 = AuthenticationRequestParameters;
            int i23 = i22 & 77;
            int i24 = (i22 | 77) & (~i23);
            int i25 = -(-(i23 << 1));
            getDeviceData = (((i24 | i25) << 1) - (i24 ^ i25)) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, (Button) view, Integer.valueOf(styleAttribute)}, -1173183212, 1173183218, styleAttribute);
            int i26 = AuthenticationRequestParameters;
            int i27 = i26 & 53;
            int i28 = (i26 ^ 53) | i27;
            getDeviceData = ((i27 ^ i28) + ((i28 & i27) << 1)) % 128;
            return null;
        }
        if (view instanceof EditText) {
            System.identityHashCode(getsdktransactionid);
            System.identityHashCode(getsdktransactionid);
            getSDKTransactionID(new Object[]{getsdktransactionid, (EditText) view}, 1312746890, -1312746890, System.identityHashCode(getsdktransactionid));
            int i29 = AuthenticationRequestParameters;
            int i31 = ((i29 ^ 41) - (~(-(-((i29 & 41) << 1))))) - 1;
            getDeviceData = i31 % 128;
            if (i31 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (view instanceof TextView) {
            int i32 = getDeviceData;
            int i33 = i32 & 81;
            int i34 = ((i32 ^ 81) | i33) << 1;
            int i35 = -((i32 | 81) & (~i33));
            AuthenticationRequestParameters = ((i34 ^ i35) + ((i35 & i34) << 1)) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, (TextView) view, Integer.valueOf(styleAttribute)}, 1811615328, -1811615310, styleAttribute);
            int i36 = AuthenticationRequestParameters;
            getDeviceData = ((i36 ^ 111) + ((i36 & 111) << 1)) % 128;
            return null;
        }
        if (view instanceof atd.av.getSDKReferenceNumber) {
            int i37 = getDeviceData;
            int i38 = i37 & 35;
            int i39 = (i37 | 35) & (~i38);
            int i41 = i38 << 1;
            AuthenticationRequestParameters = ((i39 ^ i41) + ((i39 & i41) << 1)) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, (atd.av.getSDKReferenceNumber) view}, 1700618921, -1700618914, System.identityHashCode(getsdktransactionid));
            int i42 = getDeviceData;
            int i43 = i42 & 15;
            AuthenticationRequestParameters = (((i42 | 15) & (~i43)) + (i43 << 1)) % 128;
            return null;
        }
        if (view instanceof atd.av.getSDKTransactionID) {
            AuthenticationRequestParameters = (getDeviceData + 117) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, (atd.av.getSDKTransactionID) view}, 1066423713, -1066423696, System.identityHashCode(getsdktransactionid));
            AuthenticationRequestParameters = (getDeviceData + 63) % 128;
            return null;
        }
        if (view instanceof getDeviceData) {
            int i44 = AuthenticationRequestParameters;
            getDeviceData = ((i44 ^ 85) + ((i44 & 85) << 1)) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, (getDeviceData) view}, 161915187, -161915182, System.identityHashCode(getsdktransactionid));
            int i45 = AuthenticationRequestParameters;
            int i46 = ((((i45 ^ 67) | (i45 & 67)) << 1) - (~(-(((~i45) & 67) | (i45 & (-68)))))) - 1;
            getDeviceData = i46 % 128;
            if (i46 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (view instanceof ViewGroup) {
            int i47 = AuthenticationRequestParameters;
            int i48 = i47 & 39;
            int i49 = (i47 ^ 39) | i48;
            getDeviceData = ((i48 ^ i49) + ((i49 & i48) << 1)) % 128;
            getSDKTransactionID(new Object[]{getsdktransactionid, view, Integer.valueOf(styleAttribute)}, 1567970437, -1567970427, styleAttribute);
            int i51 = AuthenticationRequestParameters;
            getDeviceData = (((i51 | 119) << 1) - (i51 ^ 119)) % 128;
        }
        int i52 = getDeviceData;
        int i53 = i52 ^ 23;
        int i54 = ((i52 & 23) | i53) << 1;
        int i55 = -i53;
        AuthenticationRequestParameters = ((i54 ^ i55) + ((i54 & i55) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ Object getSDKEphemeralPublicKey(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        atd.av.getSDKReferenceNumber getsdkreferencenumber = (atd.av.getSDKReferenceNumber) objArr[1];
        int i11 = AuthenticationRequestParameters + 20;
        getDeviceData = ((i11 ^ (-1)) + (i11 << 1)) % 128;
        ToolbarCustomization toolbarCustomization = getsdktransactionid.getSDKAppID.getToolbarCustomization();
        if (toolbarCustomization == null) {
            int i12 = getDeviceData + 19;
            AuthenticationRequestParameters = i12 % 128;
            if (i12 % 2 != 0) {
                return null;
            }
            throw null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(toolbarCustomization.getBackgroundColor());
        if (hexColorCode != null) {
            int i13 = AuthenticationRequestParameters;
            getDeviceData = ((i13 ^ 77) + ((i13 & 77) << 1)) % 128;
            getsdkreferencenumber.setBackgroundColor(hexColorCode.intValue());
            int i14 = getDeviceData;
            int i15 = i14 ^ 87;
            AuthenticationRequestParameters = ((((i14 & 87) | i15) << 1) - i15) % 128;
        }
        String headerText = toolbarCustomization.getHeaderText();
        if (!TextUtils.isEmpty(headerText)) {
            int i16 = getDeviceData;
            int i17 = ((i16 ^ 35) - (~((i16 & 35) << 1))) - 1;
            AuthenticationRequestParameters = i17 % 128;
            if (i17 % 2 == 0) {
                getsdkreferencenumber.setTitle(headerText);
                throw null;
            }
            getsdkreferencenumber.setTitle(headerText);
            int i18 = AuthenticationRequestParameters;
            getDeviceData = ((i18 & 125) + (i18 | 125)) % 128;
        }
        String buttonText = toolbarCustomization.getButtonText();
        if (!TextUtils.isEmpty(buttonText)) {
            int i19 = getDeviceData;
            AuthenticationRequestParameters = (((i19 & (-114)) | ((~i19) & 113)) + ((i19 & 113) << 1)) % 128;
            getsdkreferencenumber.setCancelButtonText(buttonText);
            int i21 = AuthenticationRequestParameters;
            int i22 = i21 & 39;
            int i23 = (i21 ^ 39) | i22;
            getDeviceData = ((i22 & i23) + (i23 | i22)) % 128;
        }
        Integer hexColorCode2 = Customization.parseHexColorCode(toolbarCustomization.getTextColor());
        if (hexColorCode2 != null) {
            int i24 = AuthenticationRequestParameters;
            int i25 = i24 & 57;
            getDeviceData = ((i25 - (~(-(-((i24 ^ 57) | i25))))) - 1) % 128;
            getsdkreferencenumber.setTitleTextColor(hexColorCode2.intValue());
            getsdkreferencenumber.setCancelButtonTextColor(hexColorCode2.intValue());
            int i26 = getDeviceData;
            AuthenticationRequestParameters = ((i26 & 9) + (i26 | 9)) % 128;
        }
        Typeface typeface = Customization.parseTypeface(getsdkreferencenumber.getContext(), toolbarCustomization.getTextFontName());
        if (typeface != null) {
            int i27 = getDeviceData;
            int i28 = ((i27 ^ 72) + ((i27 & 72) << 1)) - 1;
            AuthenticationRequestParameters = i28 % 128;
            if (i28 % 2 == 0) {
                getsdkreferencenumber.setTitleTypeface(typeface);
                getsdkreferencenumber.setCancelButtonTextTypeface(typeface);
                throw null;
            }
            getsdkreferencenumber.setTitleTypeface(typeface);
            getsdkreferencenumber.setCancelButtonTextTypeface(typeface);
            int i29 = AuthenticationRequestParameters;
            getDeviceData = (((i29 | 79) << 1) - (i29 ^ 79)) % 128;
        }
        int textFontSize = toolbarCustomization.getTextFontSize();
        if (textFontSize > 0) {
            int i31 = AuthenticationRequestParameters;
            int i32 = ((i31 & 50) + (i31 | 50)) - 1;
            getDeviceData = i32 % 128;
            if (i32 % 2 != 0) {
                getsdkreferencenumber.setTitleFontSize(Integer.valueOf(textFontSize));
                int i33 = 23 / 0;
            } else {
                getsdkreferencenumber.setTitleFontSize(Integer.valueOf(textFontSize));
            }
        }
        int i34 = getDeviceData;
        int i35 = i34 & 39;
        int i36 = i34 | 39;
        AuthenticationRequestParameters = (((i35 | i36) << 1) - (i36 ^ i35)) % 128;
        return null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        EditText editText = (EditText) objArr[1];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 29;
        getDeviceData = (i12 + ((i11 ^ 29) | i12)) % 128;
        TextBoxCustomization textBoxCustomization = getsdktransactionid.getSDKAppID.getTextBoxCustomization();
        if (textBoxCustomization == null) {
            int i13 = AuthenticationRequestParameters;
            int i14 = i13 & 59;
            int i15 = i13 | 59;
            int i16 = (i14 & i15) + (i15 | i14);
            getDeviceData = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 64 / 0;
            }
            return null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(textBoxCustomization.getBorderColor());
        if (hexColorCode != null) {
            int i18 = getDeviceData;
            int i19 = i18 & 17;
            int i21 = ((i18 ^ 17) | i19) << 1;
            int i22 = -((i18 | 17) & (~i19));
            AuthenticationRequestParameters = ((i21 & i22) + (i22 | i21)) % 128;
            int i23 = AuthenticationRequestParameters;
            int i24 = i23 & 13;
            getDeviceData = (i24 + ((i23 ^ 13) | i24)) % 128;
            editText.setBackgroundTintList(ColorStateList.valueOf(hexColorCode.intValue()));
            int i25 = AuthenticationRequestParameters;
            int i26 = i25 & 11;
            int i27 = (i25 | 11) & (~i26);
            int i28 = -(-(i26 << 1));
            getDeviceData = ((i27 ^ i28) + ((i27 & i28) << 1)) % 128;
        }
        getSDKTransactionID(new Object[]{editText, textBoxCustomization}, -2026149408, 2026149417, (int) System.currentTimeMillis());
        int i29 = AuthenticationRequestParameters;
        int i31 = ((i29 | 35) << 1) - (i29 ^ 35);
        getDeviceData = i31 % 128;
        if (i31 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * (-300)) + (i12 * EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE) + ((~(i11 | i12 | i13)) * (-301));
        int i15 = ~i12;
        switch (i14 + (((~(i15 | i13)) | (~((~i13) | i11))) * (-301)) + (((~((~i11) | i13)) | i15) * EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE)) {
            case 1:
                return AuthenticationRequestParameters(objArr);
            case 2:
                return getSDKAppID(objArr);
            case 3:
                return getDeviceData(objArr);
            case 4:
                return getSDKTransactionID(objArr);
            case 5:
                return ChallengeResultCancelled(objArr);
            case 6:
                return getMessageVersion(objArr);
            case 7:
                return getSDKEphemeralPublicKey(objArr);
            case 8:
                return ChallengeResult(objArr);
            case 9:
                return BuildConfig(objArr);
            case 10:
                return ChallengeResultCompleted(objArr);
            case 11:
                return ChallengeResultError(objArr);
            case 12:
                return ChallengeResultTimeout(objArr);
            case 13:
                return getTransactionStatus(objArr);
            case 14:
                return getAdditionalDetails(objArr);
            case 15:
                return ChallengeStatusHandler(objArr);
            case 16:
                getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
                Drawable drawable = (Drawable) objArr[1];
                Integer num = (Integer) objArr[2];
                int i16 = getDeviceData;
                int i17 = i16 ^ 39;
                int i18 = -(-((i16 & 39) << 1));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                AuthenticationRequestParameters = i19 % 128;
                if (i19 % 2 == 0) {
                    getSDKTransactionID(new Object[]{getsdktransactionid, drawable, num, Boolean.FALSE}, -2025566395, 2025566398, System.identityHashCode(getsdktransactionid));
                } else {
                    getSDKTransactionID(new Object[]{getsdktransactionid, drawable, num, Boolean.FALSE}, -2025566395, 2025566398, System.identityHashCode(getsdktransactionid));
                }
                int i21 = AuthenticationRequestParameters;
                getDeviceData = ((i21 ^ 105) + ((i21 & 105) << 1)) % 128;
                return null;
            case 17:
                return onCompletion(objArr);
            case 18:
                return ChallengeResultKt(objArr);
            case 19:
                return ChallengeStatusReceiver(objArr);
            default:
                return getSDKReferenceNumber(objArr);
        }
    }

    private static /* synthetic */ Object getTransactionStatus(Object[] objArr) {
        TextView textView = (TextView) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 49;
        getDeviceData = (((i11 | 49) & (~i12)) + (i12 << 1)) % 128;
        Integer hexColorCode = Customization.parseHexColorCode(str);
        if (hexColorCode != null) {
            int i13 = getDeviceData;
            int i14 = i13 & 7;
            int i15 = -(-((i13 ^ 7) | i14));
            AuthenticationRequestParameters = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
            textView.setTextColor(hexColorCode.intValue());
            int i16 = getDeviceData;
            AuthenticationRequestParameters = ((-2) - ((((i16 | 4) << 1) - (i16 ^ 4)) ^ (-1))) % 128;
        }
        Typeface typeface = Customization.parseTypeface(textView.getContext(), str2);
        if (typeface != null) {
            int i17 = AuthenticationRequestParameters;
            getDeviceData = (((i17 ^ 23) - (~((i17 & 23) << 1))) - 1) % 128;
            textView.setTypeface(typeface);
            AuthenticationRequestParameters = ((-2) - ((getDeviceData + 26) ^ (-1))) % 128;
        }
        if (iIntValue > 0) {
            int i18 = getDeviceData + 55;
            AuthenticationRequestParameters = i18 % 128;
            if (i18 % 2 == 0) {
                textView.setTextSize(iIntValue);
                throw null;
            }
            textView.setTextSize(iIntValue);
            getDeviceData = (AuthenticationRequestParameters + 87) % 128;
        }
        int i19 = AuthenticationRequestParameters;
        int i21 = i19 & 9;
        getDeviceData = ((i21 - (~((i19 ^ 9) | i21))) - 1) % 128;
        return null;
    }

    private static /* synthetic */ Object onCompletion(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        atd.av.getSDKTransactionID getsdktransactionid2 = (atd.av.getSDKTransactionID) objArr[1];
        int i11 = getDeviceData;
        int i12 = ((i11 ^ 73) | (i11 & 73)) << 1;
        int i13 = -(((~i11) & 73) | (i11 & (-74)));
        int i14 = (i12 & i13) + (i13 | i12);
        AuthenticationRequestParameters = i14 % 128;
        if (i14 % 2 == 0) {
            getsdktransactionid.getSDKAppID.getExpandableInfoCustomization();
            throw null;
        }
        ExpandableInfoCustomization expandableInfoCustomization = getsdktransactionid.getSDKAppID.getExpandableInfoCustomization();
        if (expandableInfoCustomization == null) {
            int i15 = AuthenticationRequestParameters;
            int i16 = (i15 & 49) + (i15 | 49);
            getDeviceData = i16 % 128;
            if (i16 % 2 == 0) {
                return null;
            }
            throw null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(expandableInfoCustomization.getHighlightedBackgroundColor());
        if (hexColorCode != null) {
            AuthenticationRequestParameters = (getDeviceData + 59) % 128;
            getsdktransactionid2.setHeaderBackgroundColor(hexColorCode.intValue());
            int i17 = AuthenticationRequestParameters;
            int i18 = i17 & 117;
            int i19 = (i17 ^ 117) | i18;
            getDeviceData = ((i18 & i19) + (i19 | i18)) % 128;
        }
        Integer hexColorCode2 = Customization.parseHexColorCode(expandableInfoCustomization.getExpandedStateIndicatorColor());
        if (hexColorCode2 != null) {
            int i21 = getDeviceData;
            int i22 = (i21 & (-26)) | ((~i21) & 25);
            int i23 = (i21 & 25) << 1;
            AuthenticationRequestParameters = ((i22 & i23) + (i23 | i22)) % 128;
            getsdktransactionid2.setStateIndicatorColor(hexColorCode2.intValue());
            int i24 = getDeviceData;
            AuthenticationRequestParameters = ((i24 & 113) + (i24 | 113)) % 128;
        }
        int i25 = getDeviceData;
        int i26 = ((((i25 ^ 111) | (i25 & 111)) << 1) - (~(-(((~i25) & 111) | (i25 & (-112)))))) - 1;
        AuthenticationRequestParameters = i26 % 128;
        if (i26 % 2 != 0) {
            return null;
        }
        throw null;
    }

    final void cL_(Window window) {
        getSDKTransactionID(new Object[]{this, window}, 1131574936, -1131574924, System.identityHashCode(this));
    }

    final void cM_(View view, AttributeSet attributeSet) {
        getSDKTransactionID(new Object[]{this, view, attributeSet}, -1414219135, 1414219137, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        Button button = (Button) objArr[1];
        ButtonCustomization buttonCustomization = (ButtonCustomization) objArr[2];
        int i11 = AuthenticationRequestParameters;
        int i12 = ((i11 ^ 15) | (i11 & 15)) << 1;
        int i13 = -((i11 & (-16)) | ((~i11) & 15));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        getDeviceData = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (buttonCustomization == null) {
            int i15 = i11 & 27;
            getDeviceData = (((~i15) & (i11 | 27)) + (i15 << 1)) % 128;
            return null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(buttonCustomization.getBackgroundColor());
        if (hexColorCode != null) {
            int i16 = AuthenticationRequestParameters;
            int i17 = (i16 & 29) + (i16 | 29);
            getDeviceData = i17 % 128;
            if (i17 % 2 != 0) {
                getSDKTransactionID(new Object[]{getsdktransactionid, button.getBackground(), hexColorCode}, -94988286, 94988302, System.identityHashCode(getsdktransactionid));
                int i18 = 79 / 0;
            } else {
                getSDKTransactionID(new Object[]{getsdktransactionid, button.getBackground(), hexColorCode}, -94988286, 94988302, System.identityHashCode(getsdktransactionid));
            }
            getDeviceData = (AuthenticationRequestParameters + 79) % 128;
        }
        getSDKTransactionID(new Object[]{getsdktransactionid, button, buttonCustomization}, 348437345, -348437330, System.identityHashCode(getsdktransactionid));
        int i19 = AuthenticationRequestParameters;
        int i21 = (i19 & 26) + (i19 | 26);
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        getDeviceData = i22 % 128;
        if (i22 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void getSDKReferenceNumber(View view, int i11) {
        getSDKTransactionID(new Object[]{this, view, Integer.valueOf(i11)}, 1567970437, -1567970427, i11);
    }

    private void AuthenticationRequestParameters(atd.av.getSDKReferenceNumber getsdkreferencenumber) {
        getSDKTransactionID(new Object[]{this, getsdkreferencenumber}, 1700618921, -1700618914, System.identityHashCode(this));
    }

    private static void getSDKTransactionID(getDeviceData getdevicedata, String str, int i11) {
        getSDKTransactionID(new Object[]{getdevicedata, str, Integer.valueOf(i11)}, -1769891804, 1769891805, i11);
    }

    private void getSDKTransactionID(atd.av.getSDKTransactionID getsdktransactionid) {
        getSDKTransactionID(new Object[]{this, getsdktransactionid}, 1066423713, -1066423696, System.identityHashCode(this));
    }

    private void getDeviceData(getDeviceData getdevicedata) {
        getSDKTransactionID(new Object[]{this, getdevicedata}, 161915187, -161915182, System.identityHashCode(this));
    }
}
