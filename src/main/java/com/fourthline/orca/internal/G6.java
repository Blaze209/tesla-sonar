package com.fourthline.orca.internal;

import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class G6 implements DeviceDataCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25907d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25908e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H6 f25909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f25910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f25911c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public G6(H6 factory, wn0.a deviceDataCollectionProvider) {
        p013kotlin.jvm.internal.s.k(factory, "factory");
        p013kotlin.jvm.internal.s.k(deviceDataCollectionProvider, "deviceDataCollectionProvider");
        this.f25909a = factory;
        this.f25910b = deviceDataCollectionProvider;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        try {
            DeviceDataCollection deviceDataCollection = (DeviceDataCollection) this.f25910b.invoke();
            deviceDataCollection.getEnabled();
            if (this.f25911c == null) {
                List listA = this.f25909a.a(deviceDataCollection);
                this.f25911c = listA;
                if (listA != null) {
                    listA.size();
                }
            }
            List list = this.f25911c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((DeviceDataCollector) it.next()).startDataCollection();
                }
            }
        } catch (Exception unused) {
        }
    }
}
