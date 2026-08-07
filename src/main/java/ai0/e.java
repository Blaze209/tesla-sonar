package ai0;

import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lai0/e;", "Lai0/a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/s0;)V", "Lai0/f;", "stepData", "Ljn0/h0;", "a", "(Lai0/f;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;", "Landroidx/lifecycle/s0;", "Ljava/util/ArrayList;", "collectedData", "", "c", "Z", "isActive", "()Z", DateTokenConverter.CONVERTER_KEY, "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<f> collectedData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isActive;

    public e(s0 savedStateHandle) {
        s.k(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        ArrayList<f> arrayList = (ArrayList) savedStateHandle.f("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData");
        this.collectedData = arrayList == null ? new ArrayList<>() : arrayList;
        this.isActive = true;
    }

    @Override // ai0.a
    public void a(f stepData) {
        s.k(stepData, "stepData");
        this.collectedData.add(stepData);
        this.savedStateHandle.n("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData", this.collectedData);
    }

    public ArrayList<f> b() {
        return new ArrayList<>(this.collectedData);
    }

    @Override // ai0.a
    /* JADX INFO: renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }
}
