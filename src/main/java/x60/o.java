package x60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.SetupIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lx60/o;", "Lu30/a;", "Lcom/stripe/android/model/d1;", "", "elementsSessionId", "Lcom/stripe/android/model/g0$b$b;", "setupMode", "", "isLiveMode", "Lkotlin/Function0;", "", "timeProvider", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/g0$b$b;ZLwn0/a;)V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/d1;", "Ljava/lang/String;", "c", "Lcom/stripe/android/model/g0$b$b;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lwn0/a;", "f", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o implements u30.a<SetupIntent> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f122856f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String elementsSessionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DeferredIntentParams.b.Setup setupMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Long> timeProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lx60/o$a;", "", "<init>", "()V", "", "FIELD_COUNTRY_CODE", "Ljava/lang/String;", "FIELD_LINK_FUNDING_SOURCES", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o(String str, DeferredIntentParams.b.Setup setupMode, boolean z11, wn0.a<Long> timeProvider) {
        p013kotlin.jvm.internal.s.k(setupMode, "setupMode");
        p013kotlin.jvm.internal.s.k(timeProvider, "timeProvider");
        this.elementsSessionId = str;
        this.setupMode = setupMode;
        this.isLiveMode = z11;
        this.timeProvider = timeProvider;
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SetupIntent a(JSONObject json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        u30.a.Companion companion = u30.a.INSTANCE;
        List<String> listA = companion.a(json.optJSONArray("payment_method_types"));
        List<String> listA2 = companion.a(json.optJSONArray("unactivated_payment_method_types"));
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listA2, 10));
        Iterator<T> it = listA2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        List<String> listA3 = u30.a.INSTANCE.a(json.optJSONArray("link_funding_sources"));
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(listA3, 10));
        Iterator<T> it2 = listA3.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
            arrayList2.add(lowerCase2);
        }
        String strL = t30.e.l(json, "country_code");
        return new SetupIntent(this.elementsSessionId, null, this.timeProvider.invoke().longValue(), strL, null, null, this.isLiveMode, null, null, listA, null, this.setupMode.getSetupFutureUsage(), null, arrayList, arrayList2, null, null, 69760, null);
    }
}
