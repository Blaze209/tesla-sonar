package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Set;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010(\u001a\u00020#8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010+\u001a\u00020)8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b*\u0010'R\u001a\u00100\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001f\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00107\u001a\b\u0012\u0004\u0012\u0002010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u001c\u001a\u0004\b9\u0010\u001eR \u0010B\u001a\u00020;8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010DR \u0010G\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\bF\u00106R \u0010J\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\bI\u00106R \u0010L\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u00103\u001a\u0004\bK\u00106R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00103R \u0010O\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\bN\u00106R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010DR \u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\b<\u00106R\"\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u00103\u001a\u0004\b\u0019\u00106R \u0010U\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\bU\u00106R \u0010X\u001a\b\u0012\u0004\u0012\u00020V0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u00103\u001a\u0004\bH\u00106R\"\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\b-\u00106R \u0010\\\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u00103\u001a\u0004\b\u001b\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Lz80/q0;", "Li90/v1;", "Li90/l1;", "Lz80/p0;", "cvcTextFieldConfig", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/model/h;", "cardBrandFlow", "", "initialValue", "", "showOptionalLabel", "<init>", "(Lz80/p0;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;Z)V", "displayFormatted", "Li90/x1;", "q", "(Ljava/lang/String;)Li90/x1;", "rawValue", "Ljn0/h0;", "t", "(Ljava/lang/String;)V", "newHasFocus", "h", "(Z)V", "a", "Lz80/p0;", "b", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "c", "Z", "n", "()Z", "Lo4/x;", DateTokenConverter.CONVERTER_KEY, "I", "e", "()I", "capitalization", "Lo4/y;", "o", "keyboardType", "Lo4/z0;", "f", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "", "g", "Lkotlinx/coroutines/flow/StateFlow;", "_label", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", AnnotatedPrivateKey.LABEL, IntegerTokenConverter.CONVERTER_KEY, "getDebugLabel", "debugLabel", "Le3/m;", "j", "Le3/m;", "k", "()Le3/m;", "getAutofillType$annotations", "()V", "autofillType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_fieldValue", "p", "fieldValue", "m", "v", "rawFieldValue", "getContentDescription", "contentDescription", "_fieldState", "r", "fieldState", "_hasFocus", "visibleError", "Li90/c0;", "s", AnalyticsAttribute.Error, "isComplete", "Ln90/a;", "u", "formFieldValue", "Li90/w1;", "trailingIcon", "w", "loading", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q0 implements p010i90.v1, p010i90.l1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f127688x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 cvcTextFieldConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String initialValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean showOptionalLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int capitalization;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int keyboardType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o4.z0 visualTransformation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> _label;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> label;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final e3.m autofillType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<String> _fieldValue;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> fieldValue;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> rawFieldValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> contentDescription;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.x1> _fieldState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.x1> fieldState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _hasFocus;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> visibleError;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.c0> error;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isComplete;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<FormFieldEntry> formFieldValue;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.w1> trailingIcon;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/model/h;", "brand", "", "fieldValue", "Li90/x1;", "a", "(Lcom/stripe/android/model/h;Ljava/lang/String;)Li90/x1;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<com.stripe.android.model.h, String, p010i90.x1> {
        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p010i90.x1 invoke(com.stripe.android.model.h brand, String fieldValue) {
            p013kotlin.jvm.internal.s.k(brand, "brand");
            p013kotlin.jvm.internal.s.k(fieldValue, "fieldValue");
            return q0.this.cvcTextFieldConfig.c(brand, fieldValue, brand.getMaxCvcLength());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/h;", "cardBrand", "", "a", "(Lcom/stripe/android/model/h;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.model.h, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f127713c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(com.stripe.android.model.h cardBrand) {
            p013kotlin.jvm.internal.s.k(cardBrand, "cardBrand");
            return Integer.valueOf(cardBrand == com.stripe.android.model.h.AmericanExpress ? f30.d0.f63941d0 : f30.d0.f63947g0);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<String, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f127714c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return w80.a.a(it);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "visibleError", "Li90/x1;", "fieldState", "Li90/c0;", "a", "(ZLi90/x1;)Li90/c0;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<Boolean, p010i90.x1, p010i90.c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f127715c = new d();

        d() {
            super(2);
        }

        public final p010i90.c0 a(boolean z11, p010i90.x1 fieldState) {
            p013kotlin.jvm.internal.s.k(fieldState, "fieldState");
            p010i90.c0 c0VarA = fieldState.a();
            if (c0VarA == null || !z11) {
                return null;
            }
            return c0VarA;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ p010i90.c0 invoke(Boolean bool, p010i90.x1 x1Var) {
            return a(bool.booleanValue(), x1Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "complete", "", "value", "Ln90/a;", "a", "(ZLjava/lang/String;)Ln90/a;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.p<Boolean, String, FormFieldEntry> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f127716c = new e();

        e() {
            super(2);
        }

        public final FormFieldEntry a(boolean z11, String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return new FormFieldEntry(value, z11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ FormFieldEntry invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li90/x1;", "it", "", "a", "(Li90/x1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<p010i90.x1, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f127717c = new f();

        f() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p010i90.x1 it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return Boolean.valueOf(it.isValid());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<String, String> {
        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return q0.this.cvcTextFieldConfig.b(it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/h;", "it", "Li90/w1$c;", "a", "(Lcom/stripe/android/model/h;)Li90/w1$c;"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.model.h, p010i90.w1.Trailing> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f127719c = new h();

        h() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p010i90.w1.Trailing invoke(com.stripe.android.model.h it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return new p010i90.w1.Trailing(it.getCvcIcon(), null, false, null, 10, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li90/x1;", "fieldState", "", "hasFocus", "a", "(Li90/x1;Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.p<p010i90.x1, Boolean, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f127720c = new i();

        i() {
            super(2);
        }

        public final Boolean a(p010i90.x1 fieldState, boolean z11) {
            p013kotlin.jvm.internal.s.k(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Boolean invoke(p010i90.x1 x1Var, Boolean bool) {
            return a(x1Var, bool.booleanValue());
        }
    }

    public q0(p0 cvcTextFieldConfig, StateFlow<? extends com.stripe.android.model.h> cardBrandFlow, String str, boolean z11) {
        p013kotlin.jvm.internal.s.k(cvcTextFieldConfig, "cvcTextFieldConfig");
        p013kotlin.jvm.internal.s.k(cardBrandFlow, "cardBrandFlow");
        this.cvcTextFieldConfig = cvcTextFieldConfig;
        this.initialValue = str;
        this.showOptionalLabel = z11;
        this.capitalization = cvcTextFieldConfig.getCapitalization();
        this.keyboardType = cvcTextFieldConfig.getKeyboard();
        this.visualTransformation = cvcTextFieldConfig.getVisualTransformation();
        StateFlow<Integer> stateFlowM = r90.g.m(cardBrandFlow, b.f127713c);
        this._label = stateFlowM;
        this.label = stateFlowM;
        this.debugLabel = cvcTextFieldConfig.getDebugLabel();
        this.autofillType = e3.m.CreditCardSecurityCode;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        this.rawFieldValue = r90.g.m(MutableStateFlow, new g());
        this.contentDescription = r90.g.m(MutableStateFlow, c.f127714c);
        StateFlow<p010i90.x1> stateFlowH = r90.g.h(cardBrandFlow, MutableStateFlow, new a());
        this._fieldState = stateFlowH;
        this.fieldState = stateFlowH;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this._hasFocus = MutableStateFlow2;
        this.visibleError = r90.g.h(stateFlowH, MutableStateFlow2, i.f127720c);
        this.error = r90.g.h(j(), stateFlowH, d.f127715c);
        this.isComplete = r90.g.m(stateFlowH, f.f127717c);
        this.formFieldValue = r90.g.h(isComplete(), v(), e.f127716c);
        this.trailingIcon = r90.g.m(cardBrandFlow, h.f127719c);
        this.loading = r90.g.n(bool);
        String initialValue = getInitialValue();
        t(initialValue != null ? initialValue : "");
    }

    @Override // p010i90.l1
    public StateFlow<p010i90.c0> a() {
        return this.error;
    }

    @Override // p010i90.v1
    public StateFlow<Boolean> b() {
        return this.loading;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: c, reason: from getter */
    public o4.z0 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // p010i90.v1
    public StateFlow<String> d() {
        return i90.v1.a.c(this);
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // p010i90.v1
    public StateFlow<p010i90.w1> f() {
        return this.trailingIcon;
    }

    @Override // p010i90.v1, p010i90.i1
    public void g(boolean z11, p010i90.j1 j1Var, androidx.compose.ui.d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, p020r2.l lVar, int i13) {
        i90.v1.a.a(this, z11, j1Var, dVar, set, identifierSpec, i11, i12, lVar, i13);
    }

    @Override // p010i90.v1
    public StateFlow<String> getContentDescription() {
        return this.contentDescription;
    }

    @Override // p010i90.v1
    public StateFlow<Integer> getLabel() {
        return this.label;
    }

    @Override // p010i90.v1
    public void h(boolean newHasFocus) {
        this._hasFocus.setValue(Boolean.valueOf(newHasFocus));
    }

    @Override // p010i90.v1
    public void i(p010i90.w1.Dropdown.Item item) {
        i90.v1.a.d(this, item);
    }

    @Override // p010i90.h0
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // p010i90.v1
    public StateFlow<Boolean> j() {
        return this.visibleError;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: k, reason: from getter */
    public e3.m getAutofillType() {
        return this.autofillType;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: l, reason: from getter */
    public String getInitialValue() {
        return this.initialValue;
    }

    @Override // p010i90.h0
    public StateFlow<FormFieldEntry> m() {
        return this.formFieldValue;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: o, reason: from getter */
    public int getKeyboardType() {
        return this.keyboardType;
    }

    @Override // p010i90.v1
    public StateFlow<String> p() {
        return this.fieldValue;
    }

    @Override // p010i90.v1
    public p010i90.x1 q(String displayFormatted) {
        p013kotlin.jvm.internal.s.k(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.cvcTextFieldConfig.d(displayFormatted));
        return null;
    }

    @Override // p010i90.v1
    public StateFlow<p010i90.x1> r() {
        return this.fieldState;
    }

    @Override // p010i90.v1
    public boolean s() {
        return i90.v1.a.b(this);
    }

    @Override // p010i90.h0
    public void t(String rawValue) {
        p013kotlin.jvm.internal.s.k(rawValue, "rawValue");
        q(this.cvcTextFieldConfig.a(rawValue));
    }

    public StateFlow<String> v() {
        return this.rawFieldValue;
    }

    public /* synthetic */ q0(p0 p0Var, StateFlow stateFlow, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new p0() : p0Var, stateFlow, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? false : z11);
    }
}
