package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\"\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R \u0010(\u001a\b\u0012\u0004\u0012\u00020%0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012¨\u0006)"}, d2 = {"Lz80/a2;", "Li90/h0;", "", "saveForFutureUseInitialValue", "<init>", "(Z)V", "saveForFutureUse", "Ljn0/h0;", "w", "", "rawValue", "t", "(Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "a", "Lkotlinx/coroutines/flow/StateFlow;", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", AnnotatedPrivateKey.LABEL, "Lkotlinx/coroutines/flow/MutableStateFlow;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_saveForFutureUse", "c", "v", DateTokenConverter.CONVERTER_KEY, "p", "fieldValue", "e", "u", "rawFieldValue", "Li90/c0;", "f", AnalyticsAttribute.Error, "g", "isComplete", "Ln90/a;", "h", "m", "formFieldValue", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a2 implements p010i90.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> label = StateFlowKt.MutableStateFlow(Integer.valueOf(w80.n.f121549z0));

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _saveForFutureUse;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> saveForFutureUse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> fieldValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> rawFieldValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.c0> error;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isComplete;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<FormFieldEntry> formFieldValue;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Z)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Boolean, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127359c = new a();

        a() {
            super(1);
        }

        public final String a(boolean z11) {
            return String.valueOf(z11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ String invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "complete", "", "value", "Ln90/a;", "a", "(ZLjava/lang/String;)Ln90/a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<Boolean, String, FormFieldEntry> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f127360c = new b();

        b() {
            super(2);
        }

        public final FormFieldEntry a(boolean z11, String str) {
            return new FormFieldEntry(str, z11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ FormFieldEntry invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    public a2(boolean z11) {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z11));
        this._saveForFutureUse = MutableStateFlow;
        this.saveForFutureUse = MutableStateFlow;
        this.fieldValue = r90.g.m(MutableStateFlow, a.f127359c);
        this.rawFieldValue = p();
        this.error = r90.g.n(null);
        this.isComplete = r90.g.n(Boolean.TRUE);
        this.formFieldValue = r90.g.h(isComplete(), u(), b.f127360c);
    }

    @Override // p010i90.l1
    public StateFlow<p010i90.c0> a() {
        return this.error;
    }

    public StateFlow<Integer> getLabel() {
        return this.label;
    }

    @Override // p010i90.h0
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // p010i90.h0
    public StateFlow<FormFieldEntry> m() {
        return this.formFieldValue;
    }

    public StateFlow<String> p() {
        return this.fieldValue;
    }

    @Override // p010i90.h0
    public void t(String rawValue) {
        p013kotlin.jvm.internal.s.k(rawValue, "rawValue");
        Boolean boolE1 = p013kotlin.text.t.E1(rawValue);
        w(boolE1 != null ? boolE1.booleanValue() : true);
    }

    public StateFlow<String> u() {
        return this.rawFieldValue;
    }

    public final StateFlow<Boolean> v() {
        return this.saveForFutureUse;
    }

    public final void w(boolean saveForFutureUse) {
        this._saveForFutureUse.setValue(Boolean.valueOf(saveForFutureUse));
    }
}
