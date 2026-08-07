package freemarker.core;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends k implements lk0.p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final e f66485k = new e(".pass", Collections.EMPTY_LIST, Collections.EMPTY_MAP, null, false, m.f66501i);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f66486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f66487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f66488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f66489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f66490j;

    e(String str, List list, Map map, String str2, boolean z11, k kVar) {
        this.f66486f = str;
        this.f66487g = (String[]) list.toArray(new String[list.size()]);
        this.f66488h = map;
        this.f66490j = z11;
        this.f66489i = str2;
        i(kVar);
    }

    @Override // freemarker.core.k
    protected String d(boolean z11) {
        StringBuffer stringBuffer = new StringBuffer();
        if (z11) {
            stringBuffer.append('<');
        }
        stringBuffer.append(k());
        stringBuffer.append(' ');
        stringBuffer.append(p.c(this.f66486f));
        if (this.f66490j) {
            stringBuffer.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        }
        int length = this.f66487g.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!this.f66490j) {
                stringBuffer.append(' ');
            } else if (i11 != 0) {
                stringBuffer.append(", ");
            }
            String str = this.f66487g[i11];
            stringBuffer.append(p.b(str));
            Map map = this.f66488h;
            if (map != null && map.get(str) != null) {
                stringBuffer.append('=');
                d dVar = (d) this.f66488h.get(str);
                if (this.f66490j) {
                    stringBuffer.append(dVar.a());
                } else {
                    f.a(stringBuffer, dVar);
                }
            }
        }
        if (this.f66489i != null) {
            if (!this.f66490j) {
                stringBuffer.append(' ');
            } else if (length != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.f66489i);
            stringBuffer.append("...");
        }
        if (this.f66490j) {
            stringBuffer.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (z11) {
            stringBuffer.append('>');
            if (f() != null) {
                stringBuffer.append(f().a());
            }
            stringBuffer.append("</");
            stringBuffer.append(k());
            stringBuffer.append('>');
        }
        return stringBuffer.toString();
    }

    @Override // freemarker.core.k
    boolean h() {
        return false;
    }

    public String j() {
        return this.f66486f;
    }

    String k() {
        return this.f66490j ? "#function" : "#macro";
    }

    public boolean l() {
        return this.f66490j;
    }
}
