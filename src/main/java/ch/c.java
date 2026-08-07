package ch;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.ab;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.x;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f19328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static DataReportResult f19329e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f19330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BugTrackMessageService f19331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DataReportService f19332c;

    public c(Context context, String str) {
        this.f19330a = null;
        this.f19331b = null;
        this.f19332c = null;
        ab abVar = new ab();
        abVar.a(str);
        h hVar = new h(context);
        this.f19330a = hVar;
        this.f19331b = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, abVar);
        this.f19332c = (DataReportService) this.f19330a.a(DataReportService.class, abVar);
    }

    public static synchronized c b(Context context, String str) {
        try {
            if (f19328d == null) {
                f19328d = new c(context, str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f19328d;
    }

    @Override // ch.a
    public DataReportResult a(DataReportRequest dataReportRequest) throws InterruptedException {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.f19332c != null) {
            f19329e = null;
            new Thread(new b(this, dataReportRequest)).start();
            for (int i11 = 300000; f19329e == null && i11 >= 0; i11 -= 50) {
                Thread.sleep(50L);
            }
        }
        return f19329e;
    }

    @Override // ch.a
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        String strLogCollect;
        if (sg.a.c(str) || (bugTrackMessageService = this.f19331b) == null) {
            return false;
        }
        try {
            strLogCollect = bugTrackMessageService.logCollect(sg.a.j(str));
        } catch (Throwable unused) {
            strLogCollect = null;
        }
        if (sg.a.c(strLogCollect)) {
            return false;
        }
        return ((Boolean) new JSONObject(strLogCollect).get("success")).booleanValue();
    }
}
