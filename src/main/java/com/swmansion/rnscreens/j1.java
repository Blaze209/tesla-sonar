package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.actions.SearchIntents;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002efB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001b\u0010\u001a\u001a\u00020\u00062\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\bJ\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\bJ\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\bJ\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\bJ\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0011¢\u0006\u0004\b&\u0010\u0014J\u0017\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b(\u0010\u0010J\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\bR\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00108\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R$\u0010A\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00109\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=R$\u0010D\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00109\u001a\u0004\bE\u0010;\"\u0004\bF\u0010=R\"\u0010G\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010\u0010R\"\u0010L\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010\u0014R\"\u0010Q\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010O\"\u0004\bS\u0010\u0014R\"\u0010T\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010M\u001a\u0004\bU\u0010O\"\u0004\bV\u0010\u0014R\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010MR\u0014\u0010[\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010`\u001a\u0004\u0018\u00010]8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0016\u0010d\u001a\u0004\u0018\u00010a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/swmansion/rnscreens/j1;", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "Ljn0/h0;", "setSearchViewProps", "()V", "Landroidx/appcompat/widget/SearchView;", "searchView", "setSearchViewListeners", "(Landroidx/appcompat/widget/SearchView;)V", "", "newText", "handleTextChange", "(Ljava/lang/String;)V", "", "hasFocus", "handleFocusChange", "(Z)V", "handleClose", "handleOpen", "handleTextSubmit", "Lcom/facebook/react/uimanager/events/d;", "event", "sendEvent", "(Lcom/facebook/react/uimanager/events/d;)V", "", "visibility", "setToolbarElementsVisibility", "(I)V", "onUpdate", "onAttachedToWindow", "handleClearTextJsRequest", "handleFocusJsRequest", "handleBlurJsRequest", "flag", "handleToggleCancelButtonJsRequest", "text", "handleSetTextJsRequest", "handleCancelSearchJsRequest", "Lcom/swmansion/rnscreens/j1$b;", "inputType", "Lcom/swmansion/rnscreens/j1$b;", "getInputType", "()Lcom/swmansion/rnscreens/j1$b;", "setInputType", "(Lcom/swmansion/rnscreens/j1$b;)V", "Lcom/swmansion/rnscreens/j1$a;", "autoCapitalize", "Lcom/swmansion/rnscreens/j1$a;", "getAutoCapitalize", "()Lcom/swmansion/rnscreens/j1$a;", "setAutoCapitalize", "(Lcom/swmansion/rnscreens/j1$a;)V", "textColor", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/Integer;", "setTextColor", "(Ljava/lang/Integer;)V", "tintColor", "getTintColor", "setTintColor", "headerIconColor", "getHeaderIconColor", "setHeaderIconColor", "hintTextColor", "getHintTextColor", "setHintTextColor", "placeholder", "Ljava/lang/String;", "getPlaceholder", "()Ljava/lang/String;", "setPlaceholder", "shouldOverrideBackButton", "Z", "getShouldOverrideBackButton", "()Z", "setShouldOverrideBackButton", "autoFocus", "getAutoFocus", "setAutoFocus", "shouldShowHintSearchIcon", "getShouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "Lcom/swmansion/rnscreens/k1;", "searchViewFormatter", "Lcom/swmansion/rnscreens/k1;", "areListenersSet", "surfaceId", "I", "Lcom/swmansion/rnscreens/w0;", "getHeaderConfig", "()Lcom/swmansion/rnscreens/w0;", "headerConfig", "Lcom/swmansion/rnscreens/t0;", "getScreenStackFragment", "()Lcom/swmansion/rnscreens/t0;", "screenStackFragment", "a", "b", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class j1 extends com.facebook.react.views.view.e {
    private boolean areListenersSet;
    private a autoCapitalize;
    private boolean autoFocus;
    private Integer headerIconColor;
    private Integer hintTextColor;
    private b inputType;
    private String placeholder;
    private k1 searchViewFormatter;
    private boolean shouldOverrideBackButton;
    private boolean shouldShowHintSearchIcon;
    private final int surfaceId;
    private Integer textColor;
    private Integer tintColor;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/j1$a;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "WORDS", "SENTENCES", "CHARACTERS", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        NONE,
        WORDS,
        SENTENCES,
        CHARACTERS;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/j1$b;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/swmansion/rnscreens/j1$a;", "capitalize", "", "toAndroidInputType", "(Lcom/swmansion/rnscreens/j1$a;)I", "TEXT", "PHONE", "NUMBER", "EMAIL", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b TEXT = new d("TEXT", 0);
        public static final b PHONE = new c("PHONE", 1);
        public static final b NUMBER = new C1119b("NUMBER", 2);
        public static final b EMAIL = new a("EMAIL", 3);

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/swmansion/rnscreens/SearchBarView.SearchBarInputTypes.EMAIL", "Lcom/swmansion/rnscreens/j1$b;", "Lcom/swmansion/rnscreens/j1$a;", "capitalize", "", "toAndroidInputType", "(Lcom/swmansion/rnscreens/j1$a;)I", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class a extends b {
            a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.swmansion.rnscreens.j1.b
            public int toAndroidInputType(a capitalize) {
                p013kotlin.jvm.internal.s.k(capitalize, "capitalize");
                return 32;
            }
        }

        /* JADX INFO: renamed from: com.swmansion.rnscreens.j1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/swmansion/rnscreens/SearchBarView.SearchBarInputTypes.NUMBER", "Lcom/swmansion/rnscreens/j1$b;", "Lcom/swmansion/rnscreens/j1$a;", "capitalize", "", "toAndroidInputType", "(Lcom/swmansion/rnscreens/j1$a;)I", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class C1119b extends b {
            C1119b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.swmansion.rnscreens.j1.b
            public int toAndroidInputType(a capitalize) {
                p013kotlin.jvm.internal.s.k(capitalize, "capitalize");
                return 2;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/swmansion/rnscreens/SearchBarView.SearchBarInputTypes.PHONE", "Lcom/swmansion/rnscreens/j1$b;", "Lcom/swmansion/rnscreens/j1$a;", "capitalize", "", "toAndroidInputType", "(Lcom/swmansion/rnscreens/j1$a;)I", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class c extends b {
            c(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.swmansion.rnscreens.j1.b
            public int toAndroidInputType(a capitalize) {
                p013kotlin.jvm.internal.s.k(capitalize, "capitalize");
                return 3;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/swmansion/rnscreens/SearchBarView.SearchBarInputTypes.TEXT", "Lcom/swmansion/rnscreens/j1$b;", "Lcom/swmansion/rnscreens/j1$a;", "capitalize", "", "toAndroidInputType", "(Lcom/swmansion/rnscreens/j1$a;)I", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class d extends b {

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a.values().length];
                    try {
                        iArr[a.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a.WORDS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a.SENTENCES.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[a.CHARACTERS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            d(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.swmansion.rnscreens.j1.b
            public int toAndroidInputType(a capitalize) {
                p013kotlin.jvm.internal.s.k(capitalize, "capitalize");
                int i11 = a.$EnumSwitchMapping$0[capitalize.ordinal()];
                if (i11 == 1) {
                    return 1;
                }
                if (i11 == 2) {
                    return PKIFailureInfo.certRevoked;
                }
                if (i11 == 3) {
                    return 16384;
                }
                if (i11 == 4) {
                    return 4096;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        private static final /* synthetic */ b[] $values() {
            return new b[]{TEXT, PHONE, NUMBER, EMAIL};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = on0.a.a(bVarArr$values);
        }

        public /* synthetic */ b(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11);
        }

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public abstract int toAndroidInputType(a capitalize);

        private b(String str, int i11) {
            super(str, i11);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/j1$c", "Landroidx/appcompat/widget/SearchView$l;", "", "newText", "", "onQueryTextChange", "(Ljava/lang/String;)Z", SearchIntents.EXTRA_QUERY, "onQueryTextSubmit", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements SearchView.l {
        c() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String newText) {
            j1.this.handleTextChange(newText);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String query) {
            j1.this.handleTextSubmit(query);
            return true;
        }
    }

    public j1(ReactContext reactContext) {
        super(reactContext);
        this.inputType = b.TEXT;
        this.autoCapitalize = a.NONE;
        this.placeholder = "";
        this.shouldOverrideBackButton = true;
        this.shouldShowHintSearchIcon = true;
        this.surfaceId = com.facebook.react.uimanager.b1.f(this);
    }

    private final w0 getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof y0) {
            return ((y0) parent).getConfig();
        }
        return null;
    }

    private final t0 getScreenStackFragment() {
        w0 headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void handleClose() {
        sendEvent(new com.swmansion.rnscreens.events.o(this.surfaceId, getId()));
        setToolbarElementsVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFocusChange(boolean hasFocus) {
        sendEvent(hasFocus ? new com.swmansion.rnscreens.events.p(this.surfaceId, getId()) : new com.swmansion.rnscreens.events.m(this.surfaceId, getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOpen() {
        sendEvent(new com.swmansion.rnscreens.events.q(this.surfaceId, getId()));
        setToolbarElementsVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextChange(String newText) {
        sendEvent(new com.swmansion.rnscreens.events.n(this.surfaceId, getId(), newText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextSubmit(String newText) {
        sendEvent(new com.swmansion.rnscreens.events.r(this.surfaceId, getId(), newText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 onAttachedToWindow$lambda$0(j1 j1Var, com.swmansion.rnscreens.c newSearchView) {
        t0 screenStackFragment;
        com.swmansion.rnscreens.c searchView;
        p013kotlin.jvm.internal.s.k(newSearchView, "newSearchView");
        if (j1Var.searchViewFormatter == null) {
            j1Var.searchViewFormatter = new k1(newSearchView);
        }
        j1Var.setSearchViewProps();
        if (j1Var.autoFocus && (screenStackFragment = j1Var.getScreenStackFragment()) != null && (searchView = screenStackFragment.getSearchView()) != null) {
            searchView.focus();
        }
        return jn0.h0.f84049a;
    }

    private final void sendEvent(com.facebook.react.uimanager.events.d<?> event) {
        Context context = getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(event);
        }
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new c());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.swmansion.rnscreens.g1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                this.f55495a.handleFocusChange(z11);
            }
        });
        searchView.setOnCloseListener(new SearchView.k() { // from class: com.swmansion.rnscreens.h1
            @Override // androidx.appcompat.widget.SearchView.k
            public final boolean a() {
                return j1.setSearchViewListeners$lambda$2(this.f55507a);
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f55509a.handleOpen();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setSearchViewListeners$lambda$2(j1 j1Var) {
        j1Var.handleClose();
        return false;
    }

    private final void setSearchViewProps() {
        t0 screenStackFragment = getScreenStackFragment();
        com.swmansion.rnscreens.c searchView = screenStackFragment != null ? screenStackFragment.getSearchView() : null;
        if (searchView != null) {
            if (!this.areListenersSet) {
                setSearchViewListeners(searchView);
                this.areListenersSet = true;
            }
            searchView.setInputType(this.inputType.toAndroidInputType(this.autoCapitalize));
            k1 k1Var = this.searchViewFormatter;
            if (k1Var != null) {
                k1Var.setTextColor(this.textColor);
            }
            k1 k1Var2 = this.searchViewFormatter;
            if (k1Var2 != null) {
                k1Var2.setTintColor(this.tintColor);
            }
            k1 k1Var3 = this.searchViewFormatter;
            if (k1Var3 != null) {
                k1Var3.setHeaderIconColor(this.headerIconColor);
            }
            k1 k1Var4 = this.searchViewFormatter;
            if (k1Var4 != null) {
                k1Var4.setHintTextColor(this.hintTextColor);
            }
            k1 k1Var5 = this.searchViewFormatter;
            if (k1Var5 != null) {
                k1Var5.setPlaceholder(this.placeholder, this.shouldShowHintSearchIcon);
            }
            searchView.setOverrideBackAction(this.shouldOverrideBackButton);
        }
    }

    private final void setToolbarElementsVisibility(int visibility) {
        w0 headerConfig = getHeaderConfig();
        int i11 = 0;
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            w0 headerConfig2 = getHeaderConfig();
            y0 configSubview = headerConfig2 != null ? headerConfig2.getConfigSubview(i11) : null;
            if ((configSubview != null ? configSubview.getType() : null) != y0.a.SEARCH_BAR && configSubview != null) {
                configSubview.setVisibility(visibility);
            }
            if (i11 == configSubviewsCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final a getAutoCapitalize() {
        return this.autoCapitalize;
    }

    public final boolean getAutoFocus() {
        return this.autoFocus;
    }

    public final Integer getHeaderIconColor() {
        return this.headerIconColor;
    }

    public final Integer getHintTextColor() {
        return this.hintTextColor;
    }

    public final b getInputType() {
        return this.inputType;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.shouldOverrideBackButton;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.shouldShowHintSearchIcon;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final Integer getTintColor() {
        return this.tintColor;
    }

    public final void handleBlurJsRequest() {
        com.swmansion.rnscreens.c searchView;
        t0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.clearFocus();
    }

    public final void handleCancelSearchJsRequest() {
        com.swmansion.rnscreens.c searchView;
        t0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.cancelSearch();
    }

    public final void handleClearTextJsRequest() {
        com.swmansion.rnscreens.c searchView;
        t0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.clearText();
    }

    public final void handleFocusJsRequest() {
        com.swmansion.rnscreens.c searchView;
        t0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.focus();
    }

    public final void handleSetTextJsRequest(String text) {
        t0 screenStackFragment;
        com.swmansion.rnscreens.c searchView;
        if (text == null || (screenStackFragment = getScreenStackFragment()) == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.setText(text);
    }

    public final void handleToggleCancelButtonJsRequest(boolean flag) {
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t0 screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.setOnSearchViewCreate(new wn0.l() { // from class: com.swmansion.rnscreens.f1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return j1.onAttachedToWindow$lambda$0(this.f55493a, (c) obj);
                }
            });
        }
    }

    public final void onUpdate() {
        setSearchViewProps();
    }

    public final void setAutoCapitalize(a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.autoCapitalize = aVar;
    }

    public final void setAutoFocus(boolean z11) {
        this.autoFocus = z11;
    }

    public final void setHeaderIconColor(Integer num) {
        this.headerIconColor = num;
    }

    public final void setHintTextColor(Integer num) {
        this.hintTextColor = num;
    }

    public final void setInputType(b bVar) {
        p013kotlin.jvm.internal.s.k(bVar, "<set-?>");
        this.inputType = bVar;
    }

    public final void setPlaceholder(String str) {
        p013kotlin.jvm.internal.s.k(str, "<set-?>");
        this.placeholder = str;
    }

    public final void setShouldOverrideBackButton(boolean z11) {
        this.shouldOverrideBackButton = z11;
    }

    public final void setShouldShowHintSearchIcon(boolean z11) {
        this.shouldShowHintSearchIcon = z11;
    }

    public final void setTextColor(Integer num) {
        this.textColor = num;
    }

    public final void setTintColor(Integer num) {
        this.tintColor = num;
    }
}
