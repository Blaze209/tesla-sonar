package vw;

import android.content.Context;
import android.os.Process;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001d\u0010 R\u001a\u0010&\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010 R\u001b\u0010,\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-¨\u0006/"}, d2 = {"Lvw/a0;", "Lvw/w;", "Landroid/content/Context;", "appContext", "Lvw/y0;", "uuidGenerator", "<init>", "(Landroid/content/Context;Lvw/y0;)V", "", "Lvw/c0;", "j", "()Ljava/util/List;", "processDetails", "Lvw/v;", "processData", "", "n", "(Lvw/c0;Lvw/v;)Z", "", "", "processDataMap", "c", "(Ljava/util/Map;)Z", "b", "Ljn0/h0;", "f", "()V", "e", "(Ljava/util/Map;)Ljava/util/Map;", "a", "Landroid/content/Context;", "Lkotlin/Lazy;", "()Ljava/lang/String;", "myProcessName", "", "I", "k", "()I", "myPid", DateTokenConverter.CONVERTER_KEY, "m", "myUuid", "l", "()Lvw/c0;", "myProcessDetails", "Z", "hasGeneratedSession", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy myProcessName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int myPid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy myUuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy myProcessDetails;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasGeneratedSession;

    public a0(Context appContext, final y0 uuidGenerator) {
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        p013kotlin.jvm.internal.s.k(uuidGenerator, "uuidGenerator");
        this.appContext = appContext;
        this.myProcessName = jn0.m.b(new wn0.a() { // from class: vw.x
            @Override // wn0.a
            public final Object invoke() {
                return a0.p(this.f120061a);
            }
        });
        this.myPid = Process.myPid();
        this.myUuid = jn0.m.b(new wn0.a() { // from class: vw.y
            @Override // wn0.a
            public final Object invoke() {
                return a0.q(uuidGenerator);
            }
        });
        this.myProcessDetails = jn0.m.b(new wn0.a() { // from class: vw.z
            @Override // wn0.a
            public final Object invoke() {
                return a0.o(this.f120064a);
            }
        });
    }

    private final List<ProcessDetails> j() {
        return d0.f119925a.a(this.appContext);
    }

    private final ProcessDetails l() {
        return (ProcessDetails) this.myProcessDetails.getValue();
    }

    private final boolean n(ProcessDetails processDetails, ProcessData processData) {
        if (p013kotlin.jvm.internal.s.f(a(), processDetails.getProcessName())) {
            return (processDetails.getPid() == processData.getPid() && p013kotlin.jvm.internal.s.f(m(), processData.getUuid())) ? false : true;
        }
        return processDetails.getPid() != processData.getPid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessDetails o(a0 a0Var) {
        return d0.f119925a.b(a0Var.appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(a0 a0Var) {
        return a0Var.l().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(y0 y0Var) {
        String string = y0Var.next().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }

    @Override // vw.w
    public String a() {
        return (String) this.myProcessName.getValue();
    }

    @Override // vw.w
    public boolean b(Map<String, ProcessData> processDataMap) {
        p013kotlin.jvm.internal.s.k(processDataMap, "processDataMap");
        ProcessData processData = processDataMap.get(a());
        return (processData != null && processData.getPid() == getMyPid() && p013kotlin.jvm.internal.s.f(processData.getUuid(), m())) ? false : true;
    }

    @Override // vw.w
    public boolean c(Map<String, ProcessData> processDataMap) {
        p013kotlin.jvm.internal.s.k(processDataMap, "processDataMap");
        if (this.hasGeneratedSession) {
            return false;
        }
        List<ProcessDetails> listJ = j();
        ArrayList<Pair> arrayList = new ArrayList();
        for (ProcessDetails processDetails : listJ) {
            ProcessData processData = processDataMap.get(processDetails.getProcessName());
            Pair pair = processData != null ? new Pair(processDetails, processData) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Pair pair2 : arrayList) {
            if (!n((ProcessDetails) pair2.a(), (ProcessData) pair2.b())) {
                return false;
            }
        }
        return true;
    }

    @Override // vw.w
    public Map<String, ProcessData> d() {
        return w.a.a(this);
    }

    @Override // vw.w
    public Map<String, ProcessData> e(Map<String, ProcessData> processDataMap) {
        Map mapD;
        if (processDataMap != null && (mapD = p013kotlin.collections.v0.D(processDataMap)) != null) {
            mapD.put(a(), new ProcessData(Process.myPid(), m()));
            Map<String, ProcessData> mapA = p013kotlin.collections.v0.A(mapD);
            if (mapA != null) {
                return mapA;
            }
        }
        return p013kotlin.collections.v0.f(jn0.x.a(a(), new ProcessData(Process.myPid(), m())));
    }

    @Override // vw.w
    public void f() {
        this.hasGeneratedSession = true;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public int getMyPid() {
        return this.myPid;
    }

    public String m() {
        return (String) this.myUuid.getValue();
    }
}
