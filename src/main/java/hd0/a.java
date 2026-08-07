package hd0;

import ce0.TeslaCommandRequest;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.oapi.CommandActionExtensionsKt;
import ic0.k;
import ic0.l;
import ic0.m;
import ic0.n;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lce0/j;", "", "", DateTokenConverter.CONVERTER_KEY, "(Lce0/j;)Ljava/util/Map;", "c", "Lic0/e;", "Lic0/a;", "a", "(Lic0/e;)Lic0/a;", "addKeyPayload", "Lic0/m;", "e", "(Lic0/e;)Lic0/m;", "remoteServiceAccessRequestPayload", "Lic0/n;", "f", "(Lic0/e;)Lic0/n;", "serviceDiagnosticRequestPayload", "b", "(Lic0/e;)Ljava/lang/String;", "commandGenerationEndpoint", "message-builder_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final ic0.a a(ic0.e eVar) {
        k proxyCommand;
        s.k(eVar, "<this>");
        ic0.c action = eVar.getAction();
        if (action != null && (proxyCommand = action.getProxyCommand()) != null) {
            l action2 = proxyCommand.getAction();
            if ((action2 != null ? action2.getAddKey() : null) != null) {
                l action3 = proxyCommand.getAction();
                s.h(action3);
                ic0.a addKey = action3.getAddKey();
                s.h(addKey);
                return addKey;
            }
        }
        return null;
    }

    public static final String b(ic0.e eVar) {
        k proxyCommand;
        s.k(eVar, "<this>");
        ic0.c action = eVar.getAction();
        if (action == null || (proxyCommand = action.getProxyCommand()) == null) {
            return null;
        }
        l action2 = proxyCommand.getAction();
        if ((action2 != null ? action2.getAddKey() : null) != null) {
            return "ADD_KEY";
        }
        l action3 = proxyCommand.getAction();
        if ((action3 != null ? action3.getGetReaderKey() : null) != null) {
            return "BOOTSTRAP_ACCESS_CHALLENGE";
        }
        l action4 = proxyCommand.getAction();
        if ((action4 != null ? action4.getLock() : null) != null) {
            return "FLEET_GENERATE_SIGNED_COMMAND";
        }
        l action5 = proxyCommand.getAction();
        if ((action5 != null ? action5.getUnlock() : null) != null) {
            return "FLEET_GENERATE_SIGNED_COMMAND";
        }
        l action6 = proxyCommand.getAction();
        if ((action6 != null ? action6.getRemoteStart() : null) != null) {
            return "FLEET_GENERATE_SIGNED_COMMAND";
        }
        l action7 = proxyCommand.getAction();
        if ((action7 != null ? action7.getRemoteServiceAccessRequest() : null) != null) {
            return "FLEET_GENERATE_SIGNED_COMMAND";
        }
        l action8 = proxyCommand.getAction();
        if ((action8 != null ? action8.getServiceDiagnosticRequest() : null) != null) {
            return "FLEET_GENERATE_SIGNED_COMMAND";
        }
        l action9 = proxyCommand.getAction();
        if ((action9 != null ? action9.getUnlockAndRemoteStart() : null) != null) {
            return "FLEET_GENERATE_SIGNED_COMMAND";
        }
        return null;
    }

    public static final Map<String, String> c(TeslaCommandRequest teslaCommandRequest) {
        k proxyCommand;
        s.k(teslaCommandRequest, "<this>");
        ic0.c action = teslaCommandRequest.getRequest().getAction();
        if (action == null || (proxyCommand = action.getProxyCommand()) == null) {
            return v0.i();
        }
        l action2 = proxyCommand.getAction();
        return (action2 != null ? action2.getGetReaderKey() : null) != null ? v0.f(x.a("vin", teslaCommandRequest.getVin())) : v0.i();
    }

    public static final Map<String, String> d(TeslaCommandRequest teslaCommandRequest) {
        k proxyCommand;
        s.k(teslaCommandRequest, "<this>");
        ic0.c action = teslaCommandRequest.getRequest().getAction();
        if (action == null || (proxyCommand = action.getProxyCommand()) == null) {
            return v0.i();
        }
        l action2 = proxyCommand.getAction();
        if ((action2 != null ? action2.getAddKey() : null) != null) {
            return v0.f(x.a("vin", teslaCommandRequest.getVin()));
        }
        l action3 = proxyCommand.getAction();
        if ((action3 != null ? action3.getLock() : null) == null) {
            l action4 = proxyCommand.getAction();
            if ((action4 != null ? action4.getUnlock() : null) == null) {
                l action5 = proxyCommand.getAction();
                if ((action5 != null ? action5.getRemoteStart() : null) == null) {
                    l action6 = proxyCommand.getAction();
                    if ((action6 != null ? action6.getRemoteServiceAccessRequest() : null) == null) {
                        l action7 = proxyCommand.getAction();
                        if ((action7 != null ? action7.getServiceDiagnosticRequest() : null) == null) {
                            l action8 = proxyCommand.getAction();
                            if ((action8 != null ? action8.getUnlockAndRemoteStart() : null) == null) {
                                return v0.i();
                            }
                        }
                    }
                }
            }
        }
        Pair pairA = x.a("vin", teslaCommandRequest.getVin());
        Pair pairA2 = x.a("id", teslaCommandRequest.getRequest().getVehicleId());
        String commandQueryParamValue = CommandActionExtensionsKt.getCommandQueryParamValue(action);
        if (commandQueryParamValue == null) {
            commandQueryParamValue = "";
        }
        return v0.m(pairA, pairA2, x.a("command", commandQueryParamValue));
    }

    public static final m e(ic0.e eVar) {
        k proxyCommand;
        s.k(eVar, "<this>");
        ic0.c action = eVar.getAction();
        if (action != null && (proxyCommand = action.getProxyCommand()) != null) {
            l action2 = proxyCommand.getAction();
            if ((action2 != null ? action2.getRemoteServiceAccessRequest() : null) != null) {
                l action3 = proxyCommand.getAction();
                s.h(action3);
                m remoteServiceAccessRequest = action3.getRemoteServiceAccessRequest();
                s.h(remoteServiceAccessRequest);
                return remoteServiceAccessRequest;
            }
        }
        return null;
    }

    public static final n f(ic0.e eVar) {
        k proxyCommand;
        s.k(eVar, "<this>");
        ic0.c action = eVar.getAction();
        if (action != null && (proxyCommand = action.getProxyCommand()) != null) {
            l action2 = proxyCommand.getAction();
            if ((action2 != null ? action2.getServiceDiagnosticRequest() : null) != null) {
                l action3 = proxyCommand.getAction();
                s.h(action3);
                n serviceDiagnosticRequest = action3.getServiceDiagnosticRequest();
                s.h(serviceDiagnosticRequest);
                return serviceDiagnosticRequest;
            }
        }
        return null;
    }
}
