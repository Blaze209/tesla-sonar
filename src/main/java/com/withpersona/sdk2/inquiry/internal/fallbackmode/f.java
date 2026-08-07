package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.moshi.u;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import hh0.InquiryAttributes;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jn0.t;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import retrofit2.y;
import sn0.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "Lfh0/a;", "Lcom/squareup/moshi/u;", "moshi", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "", "staticTemplateResourceId", "<init>", "(Lcom/squareup/moshi/u;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)V", "Lhh0/d;", "attributes", "Ljn0/s;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "c", "(Lhh0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Lretrofit2/y;", "a", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/squareup/moshi/u;", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", DateTokenConverter.CONVERTER_KEY, "I", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements fh0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u moshi;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i.a staticTemplateSessionFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int staticTemplateResourceId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;", "", "", "staticTemplateResourceId", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "g", "(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        f g(int staticTemplateResourceId);
    }

    public f(u moshi, Context context, i.a staticTemplateSessionFactory, int i11) {
        s.k(moshi, "moshi");
        s.k(context, "context");
        s.k(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.moshi = moshi;
        this.context = context;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
        this.staticTemplateResourceId = i11;
    }

    @Override // fh0.a
    public Object a(String str, RequestBody requestBody, Continuation<? super y<?>> continuation) {
        y yVarI = y.i(null);
        s.j(yVarI, "success(...)");
        return yVarI;
    }

    @Override // fh0.a
    public Object b(String str, RequestBody requestBody, Continuation<? super y<?>> continuation) {
        y yVarI = y.i(null);
        s.j(yVarI, "success(...)");
        return yVarI;
    }

    @Override // fh0.a
    public Object c(InquiryAttributes inquiryAttributes, Continuation<? super jn0.s<i>> continuation) {
        String string;
        try {
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(this.staticTemplateResourceId);
            s.j(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, p013kotlin.text.d.UTF_8), PKIFailureInfo.certRevoked);
            try {
                String strF = r.f(bufferedReader);
                ArrayList arrayList = null;
                sn0.b.a(bufferedReader, null);
                JSONArray jSONArrayOptJSONArray = new JSONObject(strF).optJSONArray("steps");
                if (jSONArrayOptJSONArray == null || (string = jSONArrayOptJSONArray.toString()) == null) {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    return jn0.s.b(t.a(new FallbackException("Failed to open resource as static template")));
                }
                List list = (List) this.moshi.d(com.squareup.moshi.y.j(List.class, NextStep.class)).fromJson(string);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(v.y(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((NextStep) it.next());
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    return jn0.s.b(t.a(new FallbackException("Expected steps to contain at least one step")));
                }
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                i.a aVar = this.staticTemplateSessionFactory;
                String string2 = UUID.randomUUID().toString();
                s.j(string2, "toString(...)");
                return jn0.s.b(aVar.a(arrayList, string2));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            jn0.s.Companion companion4 = jn0.s.INSTANCE;
            return jn0.s.b(t.a(new FallbackException("Failed to open resource as static template. Resource not found.")));
        }
    }
}
