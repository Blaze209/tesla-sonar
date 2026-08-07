package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import e6.a0;
import e6.b;
import e6.b0;
import e6.c;
import e6.c0;
import e6.d;
import e6.d0;
import e6.e;
import e6.f;
import e6.g;
import e6.h;
import e6.i;
import e6.j;
import e6.k;
import e6.l;
import e6.m;
import e6.n;
import e6.o;
import e6.p;
import e6.q;
import e6.r;
import e6.t;
import e6.u;
import e6.v;
import e6.w;
import e6.x;
import e6.y;
import e6.z;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Le6/e;", "domError", "", "errorMessage", "<init>", "(Le6/e;Ljava/lang/CharSequence;)V", "f", "Le6/e;", "getDomError", "()Le6/e;", "g", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e domError;

    /* JADX INFO: renamed from: androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException$a;", "", "<init>", "()V", "", "type", "msg", "Landroidx/credentials/exceptions/GetCredentialException;", "a", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final GetCredentialException a(String type, String msg) {
            Object objB;
            s.k(type, "type");
            try {
                a.Companion companion = a.INSTANCE;
                GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new b0(), null, 2, 0 == true ? 1 : 0);
                if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    objB = companion.b(new e6.a(), msg, getPublicKeyCredentialDomException);
                } else {
                    if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                        objB = companion.b(new b(), msg, getPublicKeyCredentialDomException);
                    } else {
                        if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                            objB = companion.b(new c(), msg, getPublicKeyCredentialDomException);
                        } else {
                            if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                                objB = companion.b(new d(), msg, getPublicKeyCredentialDomException);
                            } else {
                                if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                                    objB = companion.b(new f(), msg, getPublicKeyCredentialDomException);
                                } else {
                                    if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                                        objB = companion.b(new g(), msg, getPublicKeyCredentialDomException);
                                    } else {
                                        if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                                            objB = companion.b(new h(), msg, getPublicKeyCredentialDomException);
                                        } else {
                                            if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                                                objB = companion.b(new i(), msg, getPublicKeyCredentialDomException);
                                            } else {
                                                if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                                                    objB = companion.b(new j(), msg, getPublicKeyCredentialDomException);
                                                } else {
                                                    if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                                                        objB = companion.b(new k(), msg, getPublicKeyCredentialDomException);
                                                    } else {
                                                        if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                                                            objB = companion.b(new l(), msg, getPublicKeyCredentialDomException);
                                                        } else {
                                                            if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                                                                objB = companion.b(new m(), msg, getPublicKeyCredentialDomException);
                                                            } else {
                                                                if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                                                                    objB = companion.b(new n(), msg, getPublicKeyCredentialDomException);
                                                                } else {
                                                                    if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                                                                        objB = companion.b(new o(), msg, getPublicKeyCredentialDomException);
                                                                    } else {
                                                                        if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                                                                            objB = companion.b(new p(), msg, getPublicKeyCredentialDomException);
                                                                        } else {
                                                                            if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                                                                                objB = companion.b(new q(), msg, getPublicKeyCredentialDomException);
                                                                            } else {
                                                                                if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                                                                                    objB = companion.b(new r(), msg, getPublicKeyCredentialDomException);
                                                                                } else {
                                                                                    if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                                                                                        objB = companion.b(new e6.s(), msg, getPublicKeyCredentialDomException);
                                                                                    } else {
                                                                                        if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                                                                                            objB = companion.b(new t(), msg, getPublicKeyCredentialDomException);
                                                                                        } else {
                                                                                            if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                                                                                                objB = companion.b(new u(), msg, getPublicKeyCredentialDomException);
                                                                                            } else {
                                                                                                if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                                                                                                    objB = companion.b(new v(), msg, getPublicKeyCredentialDomException);
                                                                                                } else {
                                                                                                    if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                                                                                                        objB = companion.b(new w(), msg, getPublicKeyCredentialDomException);
                                                                                                    } else {
                                                                                                        if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                                                                                                            objB = companion.b(new x(), msg, getPublicKeyCredentialDomException);
                                                                                                        } else {
                                                                                                            if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                                                                                                                objB = companion.b(new y(), msg, getPublicKeyCredentialDomException);
                                                                                                            } else {
                                                                                                                if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                                                                                                                    objB = companion.b(new z(), msg, getPublicKeyCredentialDomException);
                                                                                                                } else {
                                                                                                                    if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                                                                                                                        objB = companion.b(new a0(), msg, getPublicKeyCredentialDomException);
                                                                                                                    } else {
                                                                                                                        if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                                                                                                                            objB = companion.b(new b0(), msg, getPublicKeyCredentialDomException);
                                                                                                                        } else {
                                                                                                                            if (s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                                                                                                                                objB = companion.b(new c0(), msg, getPublicKeyCredentialDomException);
                                                                                                                            } else {
                                                                                                                                if (!s.f(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                                                                                                                                    throw new FrameworkClassParsingException();
                                                                                                                                }
                                                                                                                                objB = companion.b(new d0(), msg, getPublicKeyCredentialDomException);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return (GetCredentialException) objB;
            } catch (FrameworkClassParsingException unused) {
                return new GetCredentialCustomException(type, msg);
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ GetPublicKeyCredentialDomException(e eVar, CharSequence charSequence, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i11 & 2) != 0 ? null : charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPublicKeyCredentialDomException(e domError, CharSequence charSequence) {
        super("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + domError.getType(), charSequence);
        s.k(domError, "domError");
        this.domError = domError;
    }
}
