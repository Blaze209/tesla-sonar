package io.sentry.react;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends io.sentry.android.replay.a {
    public static String j(Object obj) {
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int iMin = Math.min(3, list.size() - 1); iMin >= 0; iMin--) {
            Object obj2 = list.get(iMin);
            if (!(obj2 instanceof Map)) {
                return null;
            }
            Map map = (Map) obj2;
            Object obj3 = map.get("name");
            Object obj4 = map.get(AnnotatedPrivateKey.LABEL);
            boolean z11 = obj4 instanceof String;
            if (!(obj3 instanceof String) && !z11) {
                return null;
            }
            if (z11) {
                sb2.append(obj4);
            } else {
                sb2.append(obj3);
            }
            Object obj5 = map.get("element");
            Object obj6 = map.get(Action.FILE_ATTRIBUTE);
            boolean z12 = obj5 instanceof String;
            boolean z13 = obj6 instanceof String;
            if (z12 && z13) {
                sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                sb2.append(obj5);
                sb2.append(", ");
                sb2.append(obj6);
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            } else if (z12) {
                sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                sb2.append(obj5);
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            } else if (z13) {
                sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                sb2.append(obj6);
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            if (iMin > 0) {
                sb2.append(" > ");
            }
        }
        return sb2.toString();
    }

    private void k(io.sentry.rrweb.a aVar, io.sentry.e eVar) {
        aVar.w(eVar.m());
        aVar.u(eVar.l());
        aVar.f(eVar.p().getTime());
        aVar.r(eVar.p().getTime() / 1000.0d);
        aVar.s("default");
    }

    @Override // io.sentry.android.replay.a, io.sentry.x3
    public io.sentry.rrweb.b a(io.sentry.e eVar) {
        if (eVar.j() == null || "sentry.event".equals(eVar.j()) || "sentry.transaction".equals(eVar.j()) || "http".equals(eVar.j())) {
            return null;
        }
        if ("touch".equals(eVar.j())) {
            return i(eVar);
        }
        if ("navigation".equals(eVar.j())) {
            return g(eVar);
        }
        if ("xhr".equals(eVar.j())) {
            return h(eVar);
        }
        io.sentry.rrweb.b bVarA = super.a(eVar);
        if ((bVarA instanceof io.sentry.rrweb.a) && "navigation".equals(((io.sentry.rrweb.a) bVarA).n())) {
            return null;
        }
        return bVarA;
    }

    public io.sentry.rrweb.b g(io.sentry.e eVar) {
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        aVar.t(eVar.j());
        k(aVar, eVar);
        return aVar;
    }

    public io.sentry.rrweb.b h(io.sentry.e eVar) {
        Double d11 = eVar.k("start_timestamp") instanceof Number ? (Double) eVar.k("start_timestamp") : null;
        Double d12 = eVar.k("end_timestamp") instanceof Number ? (Double) eVar.k("end_timestamp") : null;
        String str = eVar.k(ImagesContract.URL) instanceof String ? (String) eVar.k(ImagesContract.URL) : null;
        if (d11 == null || d12 == null || str == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (eVar.k("method") instanceof String) {
            map.put("method", eVar.k("method"));
        }
        if (eVar.k("status_code") instanceof Double) {
            Double d13 = (Double) eVar.k("status_code");
            if (d13.doubleValue() > 0.0d) {
                map.put("statusCode", Integer.valueOf(d13.intValue()));
            }
        }
        if (eVar.k("request_body_size") instanceof Double) {
            map.put("requestBodySize", eVar.k("request_body_size"));
        }
        if (eVar.k("response_body_size") instanceof Double) {
            map.put("responseBodySize", eVar.k("response_body_size"));
        }
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.s("resource.http");
        iVar.u(d11.doubleValue() / 1000.0d);
        iVar.r(d12.doubleValue() / 1000.0d);
        iVar.q(str);
        iVar.o(map);
        return iVar;
    }

    public io.sentry.rrweb.b i(io.sentry.e eVar) {
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        aVar.t("ui.tap");
        aVar.x(j(eVar.k("path")));
        k(aVar, eVar);
        return aVar;
    }
}
