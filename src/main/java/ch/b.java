package ch;

import android.util.Log;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataReportRequest f19326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f19327b;

    public b(c cVar, DataReportRequest dataReportRequest) {
        this.f19326a = dataReportRequest;
        this.f19327b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DataReportResult unused = c.f19329e = this.f19327b.f19332c.reportData(this.f19326a);
            Log.d("APSecuritySdk", "rpc success");
        } catch (Throwable th2) {
            DataReportResult unused2 = c.f19329e = new DataReportResult();
            c.f19329e.success = false;
            c.f19329e.resultCode = "static data rpc upload error, " + sg.a.a(th2);
            Log.d("APSecuritySdk", "rpc failed:" + sg.a.a(th2));
        }
    }
}
