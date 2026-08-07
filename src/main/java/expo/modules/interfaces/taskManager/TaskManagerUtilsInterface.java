package expo.modules.interfaces.taskManager;

import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface TaskManagerUtilsInterface {
    void cancelScheduledJob(Context context, int i11);

    void cancelTaskIntent(Context context, String str, String str2);

    PendingIntent createTaskIntent(Context context, TaskInterface taskInterface);

    void executeTask(TaskInterface taskInterface, Bundle bundle, TaskExecutionCallback taskExecutionCallback);

    List<PersistableBundle> extractDataFromJobParams(JobParameters jobParameters);

    void scheduleJob(Context context, TaskInterface taskInterface, List<PersistableBundle> list);
}
