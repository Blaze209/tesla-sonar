package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adyen.checkout.components.core.Address;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import k3.d1;
import k3.e1;
import kotlinx.coroutines.DebugKt;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactTextInputManager.REACT_CLASS)
public class ReactTextInputManager extends BaseViewManager<j, com.facebook.react.uimanager.m> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    protected com.facebook.react.views.text.j mReactTextViewManagerCallback;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new a();
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final String[] DRAWABLE_HANDLE_RESOURCES = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    private static final String[] DRAWABLE_HANDLE_FIELDS = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};

    class a extends HashMap<String, String> {
        a() {
            put("birthdate-day", "birthDateDay");
            put("birthdate-full", "birthDateFull");
            put("birthdate-month", "birthDateMonth");
            put("birthdate-year", "birthDateYear");
            put("cc-csc", "creditCardSecurityCode");
            put("cc-exp", "creditCardExpirationDate");
            put("cc-exp-day", "creditCardExpirationDay");
            put("cc-exp-month", "creditCardExpirationMonth");
            put("cc-exp-year", "creditCardExpirationYear");
            put("cc-number", "creditCardNumber");
            put(Scopes.EMAIL, "emailAddress");
            put("gender", "gender");
            put("name", "personName");
            put("name-family", "personFamilyName");
            put("name-given", "personGivenName");
            put("name-middle", "personMiddleName");
            put("name-middle-initial", "personMiddleInitial");
            put("name-prefix", "personNamePrefix");
            put("name-suffix", "personNameSuffix");
            put("password", "password");
            put("password-new", "newPassword");
            put("postal-address", "postalAddress");
            put("postal-address-country", "addressCountry");
            put("postal-address-extended", "extendedAddress");
            put("postal-address-extended-postal-code", "extendedPostalCode");
            put("postal-address-locality", "addressLocality");
            put("postal-address-region", "addressRegion");
            put("postal-code", "postalCode");
            put("street-address", "streetAddress");
            put("sms-otp", "smsOTPCode");
            put("tel", "phoneNumber");
            put("tel-country-code", "phoneCountryCode");
            put("tel-national", "phoneNational");
            put("tel-device", "phoneNumberDevice");
            put("username", "username");
            put("username-new", "newUsername");
        }
    }

    private static class b implements com.facebook.react.views.textinput.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f23781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EventDispatcher f23782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23784d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23785e = 0;

        public b(j jVar) {
            this.f23781a = jVar;
            ReactContext reactContextD = b1.d(jVar);
            this.f23782b = ReactTextInputManager.getEventDispatcher(reactContextD, jVar);
            this.f23783c = b1.e(reactContextD);
        }

        @Override // com.facebook.react.views.textinput.a
        public void a() {
            if (this.f23782b == null) {
                return;
            }
            int width = this.f23781a.getWidth();
            int height = this.f23781a.getHeight();
            if (this.f23781a.getLayout() != null) {
                width = this.f23781a.getCompoundPaddingLeft() + this.f23781a.getLayout().getWidth() + this.f23781a.getCompoundPaddingRight();
                height = this.f23781a.getCompoundPaddingTop() + this.f23781a.getLayout().getHeight() + this.f23781a.getCompoundPaddingBottom();
            }
            if (width == this.f23784d && height == this.f23785e) {
                return;
            }
            this.f23785e = height;
            this.f23784d = width;
            this.f23782b.h(new com.facebook.react.views.textinput.b(this.f23783c, this.f23781a.getId(), com.facebook.react.uimanager.w.f(width), com.facebook.react.uimanager.w.f(height)));
        }
    }

    private static class c implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f23786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EventDispatcher f23787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23790e;

        public c(j jVar) {
            this.f23786a = jVar;
            ReactContext reactContextD = b1.d(jVar);
            this.f23787b = ReactTextInputManager.getEventDispatcher(reactContextD, jVar);
            this.f23788c = b1.e(reactContextD);
        }

        @Override // com.facebook.react.views.textinput.x
        public void a(int i11, int i12, int i13, int i14) {
            if (this.f23789d == i11 && this.f23790e == i12) {
                return;
            }
            this.f23787b.h(com.facebook.react.views.scroll.k.d(this.f23788c, this.f23786a.getId(), com.facebook.react.views.scroll.l.SCROLL, i11, i12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, this.f23786a.getWidth(), this.f23786a.getHeight()));
            this.f23789d = i11;
            this.f23790e = i12;
        }
    }

    private static class d implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f23791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EventDispatcher f23792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23795e;

        public d(j jVar) {
            this.f23791a = jVar;
            ReactContext reactContextD = b1.d(jVar);
            this.f23792b = ReactTextInputManager.getEventDispatcher(reactContextD, jVar);
            this.f23793c = b1.e(reactContextD);
        }

        @Override // com.facebook.react.views.textinput.y
        public void a(int i11, int i12) {
            int iMin = Math.min(i11, i12);
            int iMax = Math.max(i11, i12);
            if (this.f23794d == iMin && this.f23795e == iMax) {
                return;
            }
            this.f23792b.h(new u(this.f23793c, this.f23791a.getId(), iMin, iMax));
            this.f23794d = iMin;
            this.f23795e = iMax;
        }
    }

    private final class e implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f23796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EventDispatcher f23797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f23799d = null;

        public e(ReactContext reactContext, j jVar) {
            this.f23797b = ReactTextInputManager.getEventDispatcher(reactContext, jVar);
            this.f23796a = jVar;
            this.f23798c = b1.e(reactContext);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f23799d = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (this.f23796a.J) {
                return;
            }
            if (i13 == 0 && i12 == 0) {
                return;
            }
            gn.a.c(this.f23799d);
            String strSubstring = charSequence.toString().substring(i11, i11 + i13);
            String strSubstring2 = this.f23799d.substring(i11, i11 + i12);
            if (i13 == i12 && strSubstring.equals(strSubstring2)) {
                return;
            }
            u0 stateWrapper = this.f23796a.getStateWrapper();
            if (stateWrapper != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("mostRecentEventCount", this.f23796a.x());
                writableNativeMap.putInt("opaqueCacheId", this.f23796a.getId());
                stateWrapper.updateState(writableNativeMap);
            }
            this.f23797b.h(new m(this.f23798c, this.f23796a.getId(), charSequence.toString(), this.f23796a.x()));
        }
    }

    public static /* synthetic */ boolean a(j jVar, v0 v0Var, TextView textView, int i11, KeyEvent keyEvent) {
        if ((i11 & 255) == 0 && i11 != 0) {
            return true;
        }
        boolean zY = jVar.y();
        boolean zU = jVar.U();
        boolean zT = jVar.T();
        if (zU) {
            getEventDispatcher(v0Var, jVar).h(new w(v0Var.c(), jVar.getId(), jVar.getText().toString()));
        }
        if (zT) {
            jVar.t();
        }
        return zT || zU || !zY || i11 == 5 || i11 == 7;
    }

    public static /* synthetic */ void b(v0 v0Var, j jVar, View view, boolean z11) {
        int iC = v0Var.c();
        EventDispatcher eventDispatcher = getEventDispatcher(v0Var, jVar);
        if (z11) {
            eventDispatcher.h(new p(iC, jVar.getId()));
        } else {
            eventDispatcher.h(new n(iC, jVar.getId()));
            eventDispatcher.h(new o(iC, jVar.getId(), jVar.getText().toString()));
        }
    }

    private static void checkPasswordType(j jVar) {
        if ((jVar.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (jVar.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(jVar, 128, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EventDispatcher getEventDispatcher(ReactContext reactContext, j jVar) {
        return b1.c(reactContext, jVar.getId());
    }

    private com.facebook.react.views.text.g getReactTextUpdate(String str, int i11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) com.facebook.react.views.text.p.apply(str, com.facebook.react.views.text.p.UNSET));
        return new com.facebook.react.views.text.g(spannableStringBuilder, i11, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0);
    }

    private void setAutofillHints(j jVar, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        jVar.setAutofillHints(strArr);
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        return Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.toLowerCase(Locale.ROOT).contains("xiaomi");
    }

    private static void updateStagedInputTypeFlag(j jVar, int i11, int i12) {
        jVar.setStagedInputType(((~i11) & jVar.getStagedInputType()) | i12);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return jn.c.e("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(jn.c.a().b("topSubmitEditing", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).b("topEndEditing", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).b("topFocus", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topKeyPress", jn.c.d("phasedRegistrationNames", jn.c.e("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(jn.c.a().b(com.facebook.react.views.scroll.l.getJSEventName(com.facebook.react.views.scroll.l.SCROLL), jn.c.d("registrationName", "onScroll")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return jn.c.d("AutoCapitalizationType", jn.c.g("none", 0, "characters", 4096, "words", Integer.valueOf(PKIFailureInfo.certRevoked), "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.m> getShadowNodeClass() {
        return v.class;
    }

    @no.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(j jVar, boolean z11) {
        jVar.setAllowFontScaling(z11);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @no.a(name = "autoCapitalize")
    public void setAutoCapitalize(j jVar, Dynamic dynamic) {
        int iAsInt;
        if (dynamic.getType() == ReadableType.Number) {
            iAsInt = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String strAsString = dynamic.asString();
            strAsString.getClass();
            byte b11 = -1;
            switch (strAsString.hashCode()) {
                case 3387192:
                    if (strAsString.equals("none")) {
                        b11 = 0;
                    }
                    break;
                case 113318569:
                    if (strAsString.equals("words")) {
                        b11 = 1;
                    }
                    break;
                case 490141296:
                    if (strAsString.equals("sentences")) {
                        b11 = 2;
                    }
                    break;
                case 1245424234:
                    if (strAsString.equals("characters")) {
                        b11 = 3;
                    }
                    break;
            }
            switch (b11) {
                case 0:
                    iAsInt = 0;
                    break;
                case 1:
                    iAsInt = PKIFailureInfo.certRevoked;
                    break;
                case 2:
                default:
                    iAsInt = 16384;
                    break;
                case 3:
                    iAsInt = 4096;
                    break;
            }
        } else {
            iAsInt = 16384;
        }
        updateStagedInputTypeFlag(jVar, AUTOCAPITALIZE_FLAGS, iAsInt);
    }

    @no.a(name = "autoCorrect")
    public void setAutoCorrect(j jVar, Boolean bool) {
        int i11;
        if (bool != null) {
            i11 = bool.booleanValue() ? 32768 : PKIFailureInfo.signerNotTrusted;
        } else {
            i11 = 0;
        }
        updateStagedInputTypeFlag(jVar, 557056, i11);
    }

    @no.a(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(j jVar, boolean z11) {
        jVar.setAutoFocus(z11);
    }

    @no.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(j jVar, int i11, Integer num) {
        com.facebook.react.uimanager.a.q(jVar, so.n.ALL, num);
    }

    @no.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(j jVar, int i11, float f11) {
        com.facebook.react.uimanager.a.r(jVar, so.d.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(f11, com.facebook.react.uimanager.p.POINT));
    }

    @no.a(name = "borderStyle")
    public void setBorderStyle(j jVar, String str) {
        com.facebook.react.uimanager.a.s(jVar, str == null ? null : so.f.fromString(str));
    }

    @no.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(j jVar, int i11, float f11) {
        com.facebook.react.uimanager.a.t(jVar, so.n.values()[i11], Float.valueOf(f11));
    }

    @no.a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(j jVar, boolean z11) {
        if (jVar.getStagedInputType() == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        jVar.setCursorVisible(!z11);
    }

    @no.a(customType = "Color", name = "color")
    public void setColor(j jVar, Integer num) {
        if (num != null) {
            jVar.setTextColor(num.intValue());
            return;
        }
        ColorStateList colorStateListB = com.facebook.react.views.text.a.b(jVar.getContext());
        if (colorStateListB != null) {
            jVar.setTextColor(colorStateListB);
            return;
        }
        Context context = jVar.getContext();
        String str = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Could not get default text color from View Context: ");
        sb2.append(context != null ? context.getClass().getCanonicalName() : Address.ADDRESS_NULL_PLACEHOLDER);
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sb2.toString()));
    }

    @no.a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(j jVar, boolean z11) {
        jVar.setContextMenuHidden(z11);
    }

    @no.a(customType = "Color", name = "cursorColor")
    public void setCursorColor(j jVar, Integer num) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Drawable textCursorDrawable = jVar.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (num != null) {
                    e1.a();
                    textCursorDrawable.setColorFilter(d1.a(num.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                jVar.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i11 == 28) {
            return;
        }
        try {
            Field declaredField = jVar.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i12 = declaredField.getInt(jVar);
            if (i12 == 0) {
                return;
            }
            Drawable drawableMutate = androidx.core.content.b.getDrawable(jVar.getContext(), i12).mutate();
            if (num != null) {
                drawableMutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(jVar);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @no.a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(j jVar, boolean z11) {
        jVar.setDisableFullscreenUI(z11);
    }

    @no.a(defaultBoolean = true, name = "editable")
    public void setEditable(j jVar, boolean z11) {
        jVar.setEnabled(z11);
    }

    @no.a(name = "fontFamily")
    public void setFontFamily(j jVar, String str) {
        jVar.setFontFamily(str);
    }

    @no.a(defaultFloat = 14.0f, name = OrcaFlavourKeys.FONT_SIZE)
    public void setFontSize(j jVar, float f11) {
        jVar.setFontSize(f11);
    }

    @no.a(name = "fontStyle")
    public void setFontStyle(j jVar, String str) {
        jVar.setFontStyle(str);
    }

    @no.a(name = "fontVariant")
    public void setFontVariant(j jVar, ReadableArray readableArray) {
        jVar.setFontFeatureSettings(com.facebook.react.views.text.k.c(readableArray));
    }

    @no.a(name = "fontWeight")
    public void setFontWeight(j jVar, String str) {
        jVar.setFontWeight(str);
    }

    @no.a(name = "importantForAutofill")
    public void setImportantForAutofill(j jVar, String str) {
        int i11;
        if ("no".equals(str)) {
            i11 = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i11 = 8;
        } else if ("yes".equals(str)) {
            i11 = 1;
        } else {
            i11 = "yesExcludeDescendants".equals(str) ? 4 : 0;
        }
        setImportantForAutofill(jVar, i11);
    }

    @no.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(j jVar, boolean z11) {
        jVar.setIncludeFontPadding(z11);
    }

    @no.a(name = "inlineImageLeft")
    public void setInlineImageLeft(j jVar, String str) {
        jVar.setCompoundDrawablesWithIntrinsicBounds(yo.c.d().f(jVar.getContext(), str), 0, 0, 0);
    }

    @no.a(name = "inlineImagePadding")
    public void setInlineImagePadding(j jVar, int i11) {
        jVar.setCompoundDrawablePadding(i11);
    }

    @no.a(name = "keyboardType")
    public void setKeyboardType(j jVar, String str) {
        int i11;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i11 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i11 = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i11 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            if (shouldHideCursorForEmailTextInput()) {
                jVar.setCursorVisible(false);
            }
            i11 = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i11 = 3;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
            i11 = 144;
        } else {
            i11 = "url".equalsIgnoreCase(str) ? 16 : 1;
        }
        updateStagedInputTypeFlag(jVar, 15, i11);
        checkPasswordType(jVar);
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "letterSpacing")
    public void setLetterSpacing(j jVar, float f11) {
        jVar.setLetterSpacingPt(f11);
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "lineHeight")
    public void setLineHeight(j jVar, int i11) {
        jVar.setLineHeight(i11);
    }

    @no.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(j jVar, float f11) {
        jVar.setMaxFontSizeMultiplier(f11);
    }

    @no.a(name = "maxLength")
    public void setMaxLength(j jVar, Integer num) {
        InputFilter[] filters = jVar.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z11 = false;
            for (int i11 = 0; i11 < filters.length; i11++) {
                if (filters[i11] instanceof InputFilter.LengthFilter) {
                    filters[i11] = new InputFilter.LengthFilter(num.intValue());
                    z11 = true;
                }
            }
            if (!z11) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        jVar.setFilters(inputFilterArr);
    }

    @no.a(defaultBoolean = false, name = "multiline")
    public void setMultiline(j jVar, boolean z11) {
        updateStagedInputTypeFlag(jVar, z11 ? 0 : 131072, z11 ? 131072 : 0);
    }

    @no.a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(j jVar, int i11) {
        jVar.setLines(i11);
    }

    @no.a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(j jVar, boolean z11) {
        if (z11) {
            jVar.setContentSizeWatcher(new b(jVar));
        } else {
            jVar.setContentSizeWatcher(null);
        }
    }

    @no.a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(j jVar, boolean z11) {
        jVar.setOnKeyPress(z11);
    }

    @no.a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(j jVar, boolean z11) {
        if (z11) {
            jVar.setScrollWatcher(new c(jVar));
        } else {
            jVar.setScrollWatcher(null);
        }
    }

    @no.a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(j jVar, boolean z11) {
        if (z11) {
            jVar.setSelectionWatcher(new d(jVar));
        } else {
            jVar.setSelectionWatcher(null);
        }
    }

    @no.a(name = "overflow")
    public void setOverflow(j jVar, String str) {
        jVar.setOverflow(str);
    }

    @no.a(name = "placeholder")
    public void setPlaceholder(j jVar, String str) {
        jVar.setPlaceholder(str);
    }

    @no.a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(j jVar, Integer num) {
        if (num == null) {
            jVar.setHintTextColor(com.facebook.react.views.text.a.d(jVar.getContext()));
        } else {
            jVar.setHintTextColor(num.intValue());
        }
    }

    @no.a(name = "returnKeyLabel")
    public void setReturnKeyLabel(j jVar, String str) {
        jVar.setImeActionLabel(str, IME_ACTION_ID);
    }

    @no.a(name = "returnKeyType")
    public void setReturnKeyType(j jVar, String str) {
        jVar.setReturnKeyType(str);
    }

    @no.a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(j jVar, boolean z11) {
        updateStagedInputTypeFlag(jVar, 144, z11 ? 128 : 0);
        checkPasswordType(jVar);
    }

    @no.a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(j jVar, boolean z11) {
        jVar.setSelectTextOnFocus(z11);
    }

    @no.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(j jVar, Integer num) {
        if (num == null) {
            jVar.setHighlightColor(com.facebook.react.views.text.a.c(jVar.getContext()));
        } else {
            jVar.setHighlightColor(num.intValue());
        }
    }

    @no.a(customType = "Color", name = "selectionHandleColor")
    public void setSelectionHandleColor(j jVar, Integer num) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Drawable drawableMutate = jVar.getTextSelectHandle().mutate();
            Drawable drawableMutate2 = jVar.getTextSelectHandleLeft().mutate();
            Drawable drawableMutate3 = jVar.getTextSelectHandleRight().mutate();
            if (num != null) {
                e1.a();
                BlendModeColorFilter blendModeColorFilterA = d1.a(num.intValue(), BlendMode.SRC_IN);
                drawableMutate.setColorFilter(blendModeColorFilterA);
                drawableMutate2.setColorFilter(blendModeColorFilterA);
                drawableMutate3.setColorFilter(blendModeColorFilterA);
            } else {
                drawableMutate.clearColorFilter();
                drawableMutate2.clearColorFilter();
                drawableMutate3.clearColorFilter();
            }
            jVar.setTextSelectHandle(drawableMutate);
            jVar.setTextSelectHandleLeft(drawableMutate2);
            jVar.setTextSelectHandleRight(drawableMutate3);
            return;
        }
        if (i11 == 28) {
            return;
        }
        int i12 = 0;
        while (true) {
            String[] strArr = DRAWABLE_HANDLE_RESOURCES;
            if (i12 >= strArr.length) {
                return;
            }
            try {
                Field declaredField = jVar.getClass().getDeclaredField(strArr[i12]);
                declaredField.setAccessible(true);
                int i13 = declaredField.getInt(jVar);
                if (i13 == 0) {
                    return;
                }
                Drawable drawableMutate4 = androidx.core.content.b.getDrawable(jVar.getContext(), i13).mutate();
                if (num != null) {
                    drawableMutate4.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                } else {
                    drawableMutate4.clearColorFilter();
                }
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(jVar);
                Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i12]);
                declaredField3.setAccessible(true);
                declaredField3.set(obj, drawableMutate4);
                i12++;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        }
    }

    @no.a(name = "submitBehavior")
    public void setSubmitBehavior(j jVar, String str) {
        jVar.setSubmitBehavior(str);
    }

    @no.a(name = "textAlign")
    public void setTextAlign(j jVar, String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                jVar.setJustificationMode(1);
            }
            jVar.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            jVar.setJustificationMode(0);
        }
        if (str == null || DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str)) {
            jVar.setGravityHorizontal(0);
            return;
        }
        if ("left".equals(str)) {
            jVar.setGravityHorizontal(3);
            return;
        }
        if ("right".equals(str)) {
            jVar.setGravityHorizontal(5);
            return;
        }
        if ("center".equals(str)) {
            jVar.setGravityHorizontal(1);
            return;
        }
        qk.a.I("ReactNative", "Invalid textAlign: " + str);
        jVar.setGravityHorizontal(0);
    }

    @no.a(name = "textAlignVertical")
    public void setTextAlignVertical(j jVar, String str) {
        if (str == null || DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str)) {
            jVar.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            jVar.setGravityVertical(48);
            return;
        }
        if ("bottom".equals(str)) {
            jVar.setGravityVertical(80);
            return;
        }
        if ("center".equals(str)) {
            jVar.setGravityVertical(16);
            return;
        }
        qk.a.I("ReactNative", "Invalid textAlignVertical: " + str);
        jVar.setGravityVertical(0);
    }

    @no.a(name = "autoComplete")
    public void setTextContentType(j jVar, String str) {
        if (str == null) {
            setImportantForAutofill(jVar, 2);
            return;
        }
        if (DebugKt.DEBUG_PROPERTY_VALUE_OFF.equals(str)) {
            setImportantForAutofill(jVar, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (map.containsKey(str)) {
            setAutofillHints(jVar, map.get(str));
            return;
        }
        qk.a.I("ReactNative", "Invalid autoComplete: " + str);
        setImportantForAutofill(jVar, 2);
    }

    @no.a(name = "textDecorationLine")
    public void setTextDecorationLine(j jVar, String str) {
        jVar.setPaintFlags(jVar.getPaintFlags() & (-25));
        if (str == null) {
            return;
        }
        for (String str2 : str.split(" ")) {
            if (str2.equals("underline")) {
                jVar.setPaintFlags(jVar.getPaintFlags() | 8);
            } else if (str2.equals("line-through")) {
                jVar.setPaintFlags(jVar.getPaintFlags() | 16);
            }
        }
    }

    @no.a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(j jVar, Integer num) {
        Drawable background = jVar.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e11) {
                qk.a.n(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e11);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @no.a(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(j jVar, boolean z11) {
        jVar.setShowSoftInputOnFocus(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final v0 v0Var, final j jVar) {
        jVar.setEventDispatcher(getEventDispatcher(v0Var, jVar));
        jVar.addTextChangedListener(new e(v0Var, jVar));
        jVar.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.s
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ReactTextInputManager.b(v0Var, jVar, view, z11);
            }
        });
        jVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.t
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                return ReactTextInputManager.a(jVar, v0Var, textView, i11, keyEvent);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.text.c createShadowNodeInstance() {
        return new v();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createViewInstance(v0 v0Var) {
        j jVar = new j(v0Var);
        jVar.setInputType(jVar.getInputType() & (-131073));
        jVar.setReturnKeyType("done");
        jVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(j jVar) {
        super.onAfterUpdateTransaction(jVar);
        jVar.N();
        jVar.v();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(j jVar, int i11, int i12, int i13, int i14) {
        jVar.setPadding(i11, i12, i13, i14);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(j jVar, Object obj) {
        if (obj instanceof com.facebook.react.views.text.g) {
            com.facebook.react.views.text.g gVar = (com.facebook.react.views.text.g) obj;
            int paddingLeft = (int) gVar.getPaddingLeft();
            int paddingTop = (int) gVar.getPaddingTop();
            int paddingRight = (int) gVar.getPaddingRight();
            int paddingBottom = (int) gVar.getPaddingBottom();
            int length = -1;
            if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
                if (paddingLeft == -1) {
                    paddingLeft = jVar.getPaddingLeft();
                }
                if (paddingTop == -1) {
                    paddingTop = jVar.getPaddingTop();
                }
                if (paddingRight == -1) {
                    paddingRight = jVar.getPaddingRight();
                }
                if (paddingBottom == -1) {
                    paddingBottom = jVar.getPaddingBottom();
                }
                jVar.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
            if (gVar.getContainsImages()) {
                ap.p.g(gVar.getText(), jVar);
            }
            if (jVar.getSelectionStart() == jVar.getSelectionEnd()) {
                length = gVar.getText().length() - ((jVar.getText() != null ? jVar.getText().length() : 0) - jVar.getSelectionStart());
            }
            jVar.M(gVar);
            jVar.J(gVar.getJsEventCounter(), length, length);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(j jVar, k0 k0Var, u0 u0Var) {
        if (j.M) {
            qk.a.m(TAG, "updateState: [" + jVar.getId() + "]");
        }
        if (jVar.getStateWrapper() == null) {
            jVar.setPadding(0, 0, 0, 0);
        }
        jVar.setStateWrapper(u0Var);
        ReadableMapBuffer stateDataMapBuffer = u0Var.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(jVar, k0Var, stateDataMapBuffer);
        }
        return null;
    }

    public com.facebook.react.views.text.c createShadowNodeInstance(com.facebook.react.views.text.j jVar) {
        return new v(jVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(j jVar, int i11, ReadableArray readableArray) {
        if (i11 == 1) {
            receiveCommand(jVar, "focus", readableArray);
        } else if (i11 == 2) {
            receiveCommand(jVar, "blur", readableArray);
        } else {
            if (i11 != 4) {
                return;
            }
            receiveCommand(jVar, "setTextAndSelection", readableArray);
        }
    }

    public Object getReactTextUpdate(j jVar, k0 k0Var, com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar.getCount() == 0) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a aVarW0 = aVar.w0(0);
        return com.facebook.react.views.text.g.a(com.facebook.react.views.text.o.g(jVar.getContext(), aVarW0, null), aVar.getInt(3), com.facebook.react.views.text.m.l(k0Var, com.facebook.react.views.text.o.l(aVarW0), jVar.getGravityHorizontal()), com.facebook.react.views.text.m.m(aVar.w0(1).getString(2)), com.facebook.react.views.text.m.h(k0Var, Build.VERSION.SDK_INT >= 26 ? jVar.getJustificationMode() : 0));
    }

    private void setImportantForAutofill(j jVar, int i11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        jVar.setImportantForAutofill(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(j jVar, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "blurTextInput":
            case "blur":
                jVar.u();
                break;
            case "focus":
            case "focusTextInput":
                jVar.P();
                break;
            case "setTextAndSelection":
                int i11 = readableArray.getInt(0);
                if (i11 != -1) {
                    int i12 = readableArray.getInt(2);
                    int i13 = readableArray.getInt(3);
                    if (i13 == -1) {
                        i13 = i12;
                    }
                    if (!readableArray.isNull(1)) {
                        jVar.L(getReactTextUpdate(readableArray.getString(1), i11));
                    }
                    jVar.J(i11, i12, i13);
                    break;
                }
                break;
        }
    }
}
