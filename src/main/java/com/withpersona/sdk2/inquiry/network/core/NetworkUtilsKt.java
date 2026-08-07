package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.u;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import okhttp3.ResponseBody;
import okio.j;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.text.t;
import retrofit2.y;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
public final class NetworkUtilsKt {
    private static final int NUM_RETRIES = 3;
    public static final String SUBSYSTEM = "com.withpersona.sdk2.inquiry.network";

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1, reason: invalid class name */
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt", f = "NetworkUtils.kt", i = {0, 0, 0}, l = {179}, m = "enqueueWithRetryWhen", n = {"call", "shouldRetry", "attemptNumber"}, s = {"L$0", "L$1", "I$0"})
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkUtilsKt.enqueueWithRetryWhen(null, null, this);
        }
    }

    public static final <T> Object enqueueRetriableRequestWithRetry(l<? super Continuation<? super y<T>>, ? extends Object> lVar, Continuation<? super NetworkCallResult<T>> continuation) {
        return enqueueWithRetryWhen(lVar, new l() { // from class: com.withpersona.sdk2.inquiry.network.core.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((InternalErrorInfo.NetworkErrorInfo) obj).isRecoverable());
            }
        }, continuation);
    }

    public static final <T> Object enqueueVerificationRequestWithRetry(l<? super Continuation<? super y<T>>, ? extends Object> lVar, Continuation<? super NetworkCallResult<T>> continuation) {
        return enqueueWithRetryWhen(lVar, new l() { // from class: com.withpersona.sdk2.inquiry.network.core.e
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NetworkUtilsKt.enqueueVerificationRequestWithRetry$lambda$3((InternalErrorInfo.NetworkErrorInfo) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enqueueVerificationRequestWithRetry$lambda$3(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        int code = networkErrorInfo.getCode();
        return (code == 0 || code == 409 || code == 413 || code == 422) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005c -> B:21:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <T> java.lang.Object enqueueWithRetryWhen(wn0.l<? super p013kotlin.coroutines.Continuation<? super retrofit2.y<T>>, ? extends java.lang.Object> r6, wn0.l<? super com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo, java.lang.Boolean> r7, p013kotlin.coroutines.Continuation<? super com.withpersona.sdk2.inquiry.network.core.NetworkCallResult<T>> r8) {
        /*
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1 r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1 r0 = new com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            wn0.l r7 = (wn0.l) r7
            java.lang.Object r2 = r0.L$0
            wn0.l r2 = (wn0.l) r2
            jn0.t.b(r8)
            r5 = r0
            r0 = r7
            r7 = r2
            r2 = r5
            goto L5f
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            jn0.t.b(r8)
            r8 = 0
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r0
        L48:
            r0 = r8
            r8 = r5
            r4 = 3
            if (r6 >= r4) goto L86
            r2.L$0 = r7
            r2.L$1 = r8
            r2.I$0 = r6
            r2.label = r3
            java.lang.Object r0 = r7.invoke(r2)
            if (r0 != r1) goto L5c
            return r1
        L5c:
            r5 = r0
            r0 = r8
            r8 = r5
        L5f:
            retrofit2.y r8 = (retrofit2.y) r8
            boolean r4 = r8.g()
            if (r4 == 0) goto L71
            com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r6 = new com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success
            java.lang.Object r7 = r8.a()
            r6.<init>(r7)
            return r6
        L71:
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r8 = toErrorInfo(r8)
            java.lang.Object r4 = r0.invoke(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L83
            r0 = r8
            goto L86
        L83:
            int r6 = r6 + r3
            r5 = r0
            goto L48
        L86:
            com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r6 = new com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure
            if (r0 == 0) goto L8e
            r6.<init>(r0)
            return r6
        L8e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueWithRetryWhen(wn0.l, wn0.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> NetworkCallResult<T> onFailure(NetworkCallResult<T> networkCallResult, l<? super InternalErrorInfo.NetworkErrorInfo, h0> lVar) {
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            lVar.invoke(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
        }
        return networkCallResult;
    }

    public static final <T> NetworkCallResult<T> onSuccess(NetworkCallResult<T> networkCallResult, l<? super T, h0> lVar) {
        if (networkCallResult instanceof NetworkCallResult.Success) {
            lVar.invoke((Object) ((NetworkCallResult.Success) networkCallResult).getResponse());
        }
        return networkCallResult;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0162  */
    /* JADX WARN: Code duplicated, block: B:117:0x0184 A[EDGE_INSN: B:117:0x0184->B:118:0x0185 BREAK  A[LOOP:5: B:112:0x0173->B:151:?]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x011a  */
    /* JADX WARN: Code duplicated, block: B:93:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x013e  */
    public static final InternalErrorInfo.NetworkErrorInfo toErrorInfo(y<?> yVar) {
        ErrorResponse errorResponse;
        List<ErrorResponse.Error> errors;
        List<ErrorResponse.Error> errors2;
        List<ErrorResponse.Error> errors3;
        List<ErrorResponse.Error> errors4;
        List<ErrorResponse.Error> errors5;
        List<ErrorResponse.Error> errors6;
        List<ErrorResponse.Error> errors7;
        List<ErrorResponse.Error> errors8;
        ErrorResponse.Error error;
        j jVar;
        String strH = yVar.h();
        ErrorResponse.Error rateLimitExceededError = null;
        String strH2 = (strH == null || t.y0(strH)) ? null : yVar.h();
        int iB = yVar.b();
        boolean z11 = false;
        if (iB != 401 && iB != 404) {
            if (iB == 429) {
                rateLimitExceededError = new ErrorResponse.Error.RateLimitExceededError("Quota exceeded", "");
            } else {
                HttpStatusCode httpStatusCode = HttpStatusCode.INSTANCE;
                bo0.j client_errors = httpStatusCode.getCLIENT_ERRORS();
                int first = client_errors.getFirst();
                if (iB > client_errors.getLast() || first > iB) {
                    bo0.j server_errors = httpStatusCode.getSERVER_ERRORS();
                    int first2 = server_errors.getFirst();
                    if (iB > server_errors.getLast() || first2 > iB) {
                        z11 = true;
                    }
                } else {
                    try {
                        ResponseBody responseBodyE = yVar.e();
                        errorResponse = (responseBodyE == null || (jVar = responseBodyE.getSource()) == null) ? null : (ErrorResponse) new u.b().a(ErrorResponse.Companion.getAdapter()).b(UiComponentError.Companion).d().c(ErrorResponse.class).fromJson(jVar.getBufferField().clone());
                    } catch (Exception e11) {
                        if (!(e11 instanceof JsonDataException) && !(e11 instanceof IOException)) {
                            throw e11;
                        }
                    }
                    if (errorResponse != null && (errors8 = errorResponse.getErrors()) != null && (error = (ErrorResponse.Error) v.q0(errors8)) != null) {
                        String description = error.getDescription();
                        if (description == null) {
                            description = error.getTitle();
                        }
                        if (description != null) {
                            strH2 = description;
                        }
                    }
                    if (errorResponse != null && (errors7 = errorResponse.getErrors()) != null && !errors7.isEmpty()) {
                        Iterator<T> it = errors7.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                if (errorResponse != null) {
                                                    z11 = true;
                                                    break;
                                                }
                                                z11 = true;
                                                break;
                                            }
                                            if (errorResponse != null) {
                                                z11 = true;
                                                break;
                                            }
                                            z11 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                z11 = true;
                                                break;
                                            }
                                            z11 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                z11 = true;
                                                break;
                                            }
                                            z11 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                z11 = true;
                                                break;
                                            }
                                            z11 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it.next()) instanceof ErrorResponse.Error.InactiveTemplateError) {
                            }
                        }
                    } else if (errorResponse != null && (errors5 = errorResponse.getErrors()) != null && !errors5.isEmpty()) {
                        Iterator<T> it2 = errors5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                z11 = true;
                                                break;
                                            }
                                            z11 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it2.next()) instanceof ErrorResponse.Error.InvalidConfigError) {
                            }
                        }
                    } else if (errorResponse != null && (errors4 = errorResponse.getErrors()) != null && !errors4.isEmpty()) {
                        Iterator<T> it3 = errors4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z11 = true;
                                            break;
                                        }
                                        z11 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it3.next()) instanceof ErrorResponse.Error.UnauthenticatedError) {
                            }
                        }
                    } else if (errorResponse != null && (errors3 = errorResponse.getErrors()) != null && !errors3.isEmpty()) {
                        Iterator<T> it4 = errors3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it4.next()) instanceof ErrorResponse.Error.InconsistentTransitionError) {
                            }
                        }
                    } else if (errorResponse != null && (errors2 = errorResponse.getErrors()) != null && !errors2.isEmpty()) {
                        Iterator<T> it5 = errors2.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                if (errorResponse != null) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it5.next()) instanceof ErrorResponse.Error.TransitionFromTerminalStateError) {
                            }
                        }
                    } else if (errorResponse != null && (errors = errorResponse.getErrors()) != null && !errors.isEmpty()) {
                        Iterator<T> it6 = errors.iterator();
                        do {
                            if (!it6.hasNext()) {
                                z11 = true;
                                break;
                            }
                        } while (!(((ErrorResponse.Error) it6.next()) instanceof ErrorResponse.Error.FieldNotFoundError));
                    } else {
                        z11 = true;
                        break;
                    }
                    if (errorResponse != null && (errors6 = errorResponse.getErrors()) != null) {
                        rateLimitExceededError = (ErrorResponse.Error) v.q0(errors6);
                    }
                    if (rateLimitExceededError instanceof ErrorResponse.Error.UnknownError) {
                        ((ErrorResponse.Error.UnknownError) rateLimitExceededError).setErrorBody(yVar.e());
                    }
                }
            }
        }
        return new InternalErrorInfo.NetworkErrorInfo(yVar.b(), strH2, z11, rateLimitExceededError);
    }

    public static final InternalErrorInfo.NetworkErrorInfo toSocketTimeoutErrorInfo(SocketTimeoutException socketTimeoutException) {
        return new InternalErrorInfo.NetworkErrorInfo(0, socketTimeoutException.getLocalizedMessage(), true, null, 8, null);
    }
}
