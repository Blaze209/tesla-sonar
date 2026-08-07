package hi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ii.g;
import ii.r;
import ii.v;
import ii.v.a;
import java.util.List;
import ji.HttpHeader;
import ji.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003B\u001f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR.\u0010&\u001a\u0004\u0018\u00010 2\b\u0010\u0018\u001a\u0004\u0018\u00010 8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010.\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010'8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u00101\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010'8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R.\u00103\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010'8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010)\u001a\u0004\b\u0019\u0010+\"\u0004\b2\u0010-R:\u0010:\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00106\u001a\u0004\b(\u00107\"\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R.\u0010>\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010'8\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010)\u001a\u0004\b\u0013\u0010+\"\u0004\b=\u0010-¨\u0006?"}, d2 = {"Lhi/a;", "Lii/v$a;", "D", "", "Lhi/b;", "apolloClient", "Lii/v;", "operation", "<init>", "(Lhi/b;Lii/v;)V", "Lkotlinx/coroutines/flow/Flow;", "Lii/g;", IntegerTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/Flow;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhi/b;", "getApolloClient$apollo_runtime", "()Lhi/b;", "b", "Lii/v;", "getOperation", "()Lii/v;", "Lii/r;", "<set-?>", "c", "Lii/r;", DateTokenConverter.CONVERTER_KEY, "()Lii/r;", "setExecutionContext", "(Lii/r;)V", "executionContext", "Lji/f;", "Lji/f;", "f", "()Lji/f;", "setHttpMethod", "(Lji/f;)V", "httpMethod", "", "e", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "setSendApqExtensions", "(Ljava/lang/Boolean;)V", "sendApqExtensions", "h", "setSendDocument", "sendDocument", "setEnableAutoPersistedQueries", "enableAutoPersistedQueries", "", "Lji/d;", "Ljava/util/List;", "()Ljava/util/List;", "setHttpHeaders", "(Ljava/util/List;)V", "httpHeaders", "ignoreApolloClientHttpHeaders", "j", "setCanBeBatched", "canBeBatched", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a<D extends v.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b apolloClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v<D> operation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private r executionContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f httpMethod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Boolean sendApqExtensions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Boolean sendDocument;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Boolean enableAutoPersistedQueries;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<HttpHeader> httpHeaders;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Boolean ignoreApolloClientHttpHeaders;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Boolean canBeBatched;

    public a(b apolloClient, v<D> operation) {
        s.k(apolloClient, "apolloClient");
        s.k(operation, "operation");
        this.apolloClient = apolloClient;
        this.operation = operation;
        this.executionContext = r.f78163b;
    }

    public final Object a(Continuation<? super g<D>> continuation) {
        return FlowKt.single(i(), continuation);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public Boolean getCanBeBatched() {
        return this.canBeBatched;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Boolean getEnableAutoPersistedQueries() {
        return this.enableAutoPersistedQueries;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public r getExecutionContext() {
        return this.executionContext;
    }

    public List<HttpHeader> e() {
        return this.httpHeaders;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public f getHttpMethod() {
        return this.httpMethod;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public Boolean getSendApqExtensions() {
        return this.sendApqExtensions;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public Boolean getSendDocument() {
        return this.sendDocument;
    }

    public final Flow<g<D>> i() {
        ii.f<D> fVarC = new ii.f.a(this.operation).f(getExecutionContext()).o(getHttpMethod()).n(e()).p(getSendApqExtensions()).q(getSendDocument()).e(getEnableAutoPersistedQueries()).d(getCanBeBatched()).c();
        b bVar = this.apolloClient;
        Boolean bool = this.ignoreApolloClientHttpHeaders;
        return bVar.c(fVarC, bool == null || s.f(bool, Boolean.TRUE));
    }
}
