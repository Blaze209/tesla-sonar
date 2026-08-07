package ch;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    DataReportResult a(DataReportRequest dataReportRequest);

    boolean logCollect(String str);
}
