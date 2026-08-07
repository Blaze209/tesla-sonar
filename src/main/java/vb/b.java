package vb;

import androidx.work.z;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import sb.SystemIdInfo;
import sb.b0;
import sb.m0;
import sb.v1;
import sb.x1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lsb/b0;", "workNameDao", "Lsb/x1;", "workTagDao", "Lsb/s;", "systemIdInfoDao", "", "Lsb/m0;", "workSpecs", "", DateTokenConverter.CONVERTER_KEY, "(Lsb/b0;Lsb/x1;Lsb/s;Ljava/util/List;)Ljava/lang/String;", "workSpec", "name", "", "systemId", "tags", "c", "(Lsb/m0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f118565a;

    static {
        String strI = z.i("DiagnosticsWrkr");
        s.j(strI, "tagWithPrefix(...)");
        f118565a = strI;
    }

    private static final String c(m0 m0Var, String str, Integer num, String str2) {
        return '\n' + m0Var.id + "\t " + m0Var.workerClassName + "\t " + num + "\t " + m0Var.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(b0 b0Var, x1 x1Var, sb.s sVar, List<m0> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (m0 m0Var : list) {
            SystemIdInfo systemIdInfoB = sVar.b(v1.a(m0Var));
            sb2.append(c(m0Var, v.y0(b0Var.a(m0Var.id), ",", null, null, 0, null, null, 62, null), systemIdInfoB != null ? Integer.valueOf(systemIdInfoB.systemId) : null, v.y0(x1Var.c(m0Var.id), ",", null, null, 0, null, null, 62, null)));
        }
        return sb2.toString();
    }
}
