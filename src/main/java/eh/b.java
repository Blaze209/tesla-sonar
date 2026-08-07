package eh;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static DataReportRequest a(d dVar) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (dVar == null) {
            return null;
        }
        dataReportRequest.f20149os = dVar.f62949a;
        dataReportRequest.rpcVersion = dVar.f62958j;
        dataReportRequest.bizType = "1";
        HashMap map = new HashMap();
        dataReportRequest.bizData = map;
        map.put("apdid", dVar.f62950b);
        dataReportRequest.bizData.put("apdidToken", dVar.f62951c);
        dataReportRequest.bizData.put("umidToken", dVar.f62952d);
        dataReportRequest.bizData.put("dynamicKey", dVar.f62953e);
        dataReportRequest.deviceData = dVar.f62954f;
        return dataReportRequest;
    }

    public static c b(DataReportResult dataReportResult) {
        c cVar = new c();
        if (dataReportResult == null) {
            return null;
        }
        cVar.f62938a = dataReportResult.success;
        cVar.f62939b = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            cVar.f62940c = map.get("apdid");
            cVar.f62941d = map.get("apdidToken");
            cVar.f62944g = map.get("dynamicKey");
            cVar.f62945h = map.get("timeInterval");
            cVar.f62946i = map.get("webrtcUrl");
            cVar.f62947j = "";
            String str = map.get("drmSwitch");
            if (sg.a.f(str)) {
                if (str.length() >= 1) {
                    cVar.f62942e = "" + str.charAt(0);
                }
                if (str.length() >= 3) {
                    cVar.f62943f = "" + str.charAt(2);
                }
            }
            if (map.containsKey("apse_degrade")) {
                cVar.f62948k = map.get("apse_degrade");
            }
        }
        return cVar;
    }
}
