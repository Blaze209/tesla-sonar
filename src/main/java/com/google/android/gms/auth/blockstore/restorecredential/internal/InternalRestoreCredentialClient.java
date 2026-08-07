package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth_blockstore.zzab;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¨\u0006\u0014"}, d2 = {"Lcom/google/android/gms/auth/blockstore/restorecredential/internal/InternalRestoreCredentialClient;", "Lcom/google/android/gms/common/api/GoogleApi;", "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;", "Lcom/google/android/gms/auth/blockstore/restorecredential/RestoreCredentialClient;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getRestoreCredential", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "request", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "createRestoreCredential", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "clearRestoreCredential", "", "Lcom/google/android/gms/auth/blockstore/restorecredential/ClearRestoreCredentialRequest;", "Companion", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InternalRestoreCredentialClient extends GoogleApi<Api.ApiOptions.NoOptions> implements RestoreCredentialClient {
    private static final Api<Api.ApiOptions.NoOptions> API;
    private static final Api.ClientKey<RestoreCredentialClientImpl> CLIENT_KEY;
    private static final InternalRestoreCredentialClient$Companion$clientBuilder$1 clientBuilder;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$Companion$clientBuilder$1, com.google.android.gms.common.api.Api$AbstractClientBuilder] */
    static {
        Api.ClientKey<RestoreCredentialClientImpl> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        ?? r11 = new Api.AbstractClientBuilder<RestoreCredentialClientImpl, Api.ApiOptions.NoOptions>() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$Companion$clientBuilder$1
            @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
            @NonNull
            public RestoreCredentialClientImpl buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull ClientSettings commonSettings, @NonNull Api.ApiOptions.NoOptions apiOptions, @NonNull ConnectionCallbacks connectedListener, @NonNull OnConnectionFailedListener connectionFailedListener) {
                s.k(context, "context");
                s.k(looper, "looper");
                s.k(commonSettings, "commonSettings");
                s.k(apiOptions, "apiOptions");
                s.k(connectedListener, "connectedListener");
                s.k(connectionFailedListener, "connectionFailedListener");
                return new RestoreCredentialClientImpl(context, looper, commonSettings, connectedListener, connectionFailedListener);
            }
        };
        clientBuilder = r11;
        API = new Api<>("RestoreCredential.API", r11, clientKey);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalRestoreCredentialClient(@NonNull Context context) {
        super(context, API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearRestoreCredential$lambda$2(ClearRestoreCredentialRequest request, RestoreCredentialClientImpl restoreCredentialClientImpl, final TaskCompletionSource taskCompletionSource) {
        s.k(request, "$request");
        ((IRestoreCredentialService) restoreCredentialClientImpl.getService()).clearRestoreCredential(request, new IClearRestoreCredentialCallback.Stub() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$clearRestoreCredential$1$callback$1
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback
            public void onClearRestoreCredential(@NonNull Status status, boolean cleared) {
                s.k(status, "status");
                TaskUtil.setResultOrApiException(status, Boolean.valueOf(cleared), taskCompletionSource);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createRestoreCredential$lambda$1(CreateRestoreCredentialRequest request, RestoreCredentialClientImpl restoreCredentialClientImpl, final TaskCompletionSource taskCompletionSource) {
        s.k(request, "$request");
        ((IRestoreCredentialService) restoreCredentialClientImpl.getService()).createRestoreCredential(request, new ICreateRestoreCredentialCallback.Stub() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$createRestoreCredential$1$callback$1
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback
            public void onCreateRestoreCredential(@NonNull Status status, @NonNull CreateRestoreCredentialResponse response) {
                s.k(status, "status");
                s.k(response, "response");
                TaskUtil.setResultOrApiException(status, response, taskCompletionSource);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRestoreCredential$lambda$0(GetRestoreCredentialRequest request, RestoreCredentialClientImpl restoreCredentialClientImpl, final TaskCompletionSource taskCompletionSource) {
        s.k(request, "$request");
        ((IRestoreCredentialService) restoreCredentialClientImpl.getService()).getRestoreCredential(request, new IGetRestoreCredentialCallback.Stub() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$getRestoreCredential$1$callback$1
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback
            public void onGetRestoreCredential(@NonNull Status status, @NonNull GetRestoreCredentialResponse response) {
                s.k(status, "status");
                s.k(response, "response");
                TaskUtil.setResultOrApiException(status, response, taskCompletionSource);
            }
        });
    }

    @Override // com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialClient
    public Task<Boolean> clearRestoreCredential(@NonNull final ClearRestoreCredentialRequest request) {
        s.k(request, "request");
        Task taskDoRead = doRead(TaskApiCall.builder().setFeatures(zzab.zzi).run(new RemoteCall() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(@NonNull Object obj, @NonNull Object obj2) {
                InternalRestoreCredentialClient.clearRestoreCredential$lambda$2(request, (RestoreCredentialClientImpl) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(1694).build());
        s.j(taskDoRead, "doRead(...)");
        return taskDoRead;
    }

    @Override // com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialClient
    public Task<CreateRestoreCredentialResponse> createRestoreCredential(@NonNull final CreateRestoreCredentialRequest request) {
        s.k(request, "request");
        Task taskDoRead = doRead(TaskApiCall.builder().setFeatures(zzab.zzj).run(new RemoteCall() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(@NonNull Object obj, @NonNull Object obj2) {
                InternalRestoreCredentialClient.createRestoreCredential$lambda$1(request, (RestoreCredentialClientImpl) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(1693).build());
        s.j(taskDoRead, "doRead(...)");
        return taskDoRead;
    }

    @Override // com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialClient
    public Task<GetRestoreCredentialResponse> getRestoreCredential(@NonNull final GetRestoreCredentialRequest request) {
        s.k(request, "request");
        Task taskDoRead = doRead(TaskApiCall.builder().setFeatures(zzab.zzk).run(new RemoteCall() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(@NonNull Object obj, @NonNull Object obj2) {
                InternalRestoreCredentialClient.getRestoreCredential$lambda$0(request, (RestoreCredentialClientImpl) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(1695).build());
        s.j(taskDoRead, "doRead(...)");
        return taskDoRead;
    }
}
