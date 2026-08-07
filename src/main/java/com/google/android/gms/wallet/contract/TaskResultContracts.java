package com.google.android.gms.wallet.contract;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.p002activity.result.contract.ActivityResultContract;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import h.e;

/* JADX INFO: loaded from: classes5.dex */
public final class TaskResultContracts {

    public static abstract class GetApiTaskResult<T> extends ResolveApiTaskResult<T, ApiTaskResult<T>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.ResolveApiTaskResult
        @NonNull
        public ApiTaskResult<T> outputFromTask(@NonNull Task<T> task) {
            if (task.isSuccessful()) {
                return new ApiTaskResult<>(task.getResult(), Status.RESULT_SUCCESS);
            }
            if (task.isCanceled()) {
                return new ApiTaskResult<>(new Status(16, "The task has been canceled."));
            }
            Status status = this.zza;
            return status != null ? new ApiTaskResult<>(status) : new ApiTaskResult<>(Status.RESULT_INTERNAL_ERROR);
        }

        @Override // androidx.p002activity.result.contract.ActivityResultContract
        @NonNull
        public ApiTaskResult<T> parseResult(int i11, Intent intent) {
            if (i11 != -1) {
                return i11 != 0 ? new ApiTaskResult<>(null, Status.RESULT_INTERNAL_ERROR) : new ApiTaskResult<>(null, Status.RESULT_CANCELED);
            }
            T tTaskResultFromIntent = intent != null ? taskResultFromIntent(intent) : null;
            return tTaskResultFromIntent != null ? new ApiTaskResult<>(tTaskResultFromIntent, Status.RESULT_SUCCESS) : new ApiTaskResult<>(null, Status.RESULT_INTERNAL_ERROR);
        }

        protected abstract T taskResultFromIntent(@NonNull Intent intent);
    }

    public static final class GetPaymentData extends UnpackApiTaskResult<PaymentData> {
        @Override // androidx.p002activity.result.contract.ActivityResultContract
        public PaymentData parseResult(int i11, Intent intent) {
            if (intent != null) {
                return PaymentData.getFromIntent(intent);
            }
            return null;
        }
    }

    public static abstract class ResolveApiTaskResult<I, O> extends ActivityResultContract<Task<I>, O> {
        Status zza;
        private PendingIntent zzb;

        @Override // androidx.p002activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, @NonNull Task<I> task) {
            return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new e.a(this.zzb).a());
        }

        @Override // androidx.p002activity.result.contract.ActivityResultContract
        public ActivityResultContract.a<O> getSynchronousResult(@NonNull Context context, @NonNull Task<I> task) {
            if (!task.isComplete()) {
                throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
            }
            Exception exception = task.getException();
            if (exception instanceof ApiException) {
                this.zza = ((ApiException) exception).getStatus();
                if (exception instanceof ResolvableApiException) {
                    this.zzb = ((ResolvableApiException) exception).getResolution();
                }
            }
            if (this.zzb == null) {
                return new ActivityResultContract.a<>(outputFromTask(task));
            }
            return null;
        }

        protected abstract O outputFromTask(@NonNull Task<I> task);
    }

    public static abstract class UnpackApiTaskResult<T> extends ResolveApiTaskResult<T, T> {
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.ResolveApiTaskResult
        protected T outputFromTask(@NonNull Task<T> task) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            return null;
        }
    }

    private TaskResultContracts() {
    }

    public static final class GetPaymentDataResult extends GetApiTaskResult<PaymentData> {
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.GetApiTaskResult, androidx.p002activity.result.contract.ActivityResultContract
        @NonNull
        public ApiTaskResult<PaymentData> parseResult(int i11, Intent intent) {
            if (i11 != 1) {
                return super.parseResult(i11, intent);
            }
            Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
            if (statusFromIntent == null) {
                statusFromIntent = Status.RESULT_INTERNAL_ERROR;
            }
            return new ApiTaskResult<>(statusFromIntent);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.GetApiTaskResult
        public PaymentData taskResultFromIntent(@NonNull Intent intent) {
            return PaymentData.getFromIntent(intent);
        }

        @Override // com.google.android.gms.wallet.contract.TaskResultContracts.GetApiTaskResult, androidx.p002activity.result.contract.ActivityResultContract
        @NonNull
        public final /* bridge */ /* synthetic */ Object parseResult(int i11, Intent intent) {
            return parseResult(i11, intent);
        }
    }
}
