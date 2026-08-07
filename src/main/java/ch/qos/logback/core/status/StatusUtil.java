package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class StatusUtil {

    /* JADX INFO: renamed from: sm, reason: collision with root package name */
    StatusManager f19345sm;

    public StatusUtil(Context context) {
        this.f19345sm = context.getStatusManager();
    }

    public static boolean contextHasStatusListener(Context context) {
        List<StatusListener> copyOfStatusListenerList;
        StatusManager statusManager = context.getStatusManager();
        return (statusManager == null || (copyOfStatusListenerList = statusManager.getCopyOfStatusListenerList()) == null || copyOfStatusListenerList.size() == 0) ? false : true;
    }

    public static List<Status> filterStatusListByTimeThreshold(List<Status> list, long j11) {
        ArrayList arrayList = new ArrayList();
        for (Status status : list) {
            if (status.getDate().longValue() >= j11) {
                arrayList.add(status);
            }
        }
        return arrayList;
    }

    public void addError(Object obj, String str, Throwable th2) {
        addStatus(new ErrorStatus(str, obj, th2));
    }

    public void addInfo(Object obj, String str) {
        addStatus(new InfoStatus(str, obj));
    }

    public void addStatus(Status status) {
        StatusManager statusManager = this.f19345sm;
        if (statusManager != null) {
            statusManager.add(status);
        }
    }

    public void addWarn(Object obj, String str) {
        addStatus(new WarnStatus(str, obj));
    }

    public boolean containsException(Class<?> cls) {
        Iterator<Status> it = this.f19345sm.getCopyOfStatusList().iterator();
        while (it.hasNext()) {
            for (Throwable throwable = it.next().getThrowable(); throwable != null; throwable = throwable.getCause()) {
                if (throwable.getClass().getName().equals(cls.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsMatch(int i11, String str) {
        return containsMatch(0L, i11, str);
    }

    public int getHighestLevel(long j11) {
        int level = 0;
        for (Status status : filterStatusListByTimeThreshold(this.f19345sm.getCopyOfStatusList(), j11)) {
            if (status.getLevel() > level) {
                level = status.getLevel();
            }
        }
        return level;
    }

    public boolean hasXMLParsingErrors(long j11) {
        return containsMatch(j11, 2, CoreConstants.XML_PARSING);
    }

    public boolean isErrorFree(long j11) {
        return 2 > getHighestLevel(j11);
    }

    public boolean isWarningOrErrorFree(long j11) {
        return 1 > getHighestLevel(j11);
    }

    public int matchCount(String str) {
        Pattern patternCompile = Pattern.compile(str);
        Iterator<Status> it = this.f19345sm.getCopyOfStatusList().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (patternCompile.matcher(it.next().getMessage()).lookingAt()) {
                i11++;
            }
        }
        return i11;
    }

    public boolean noXMLParsingErrorsOccurred(long j11) {
        return !hasXMLParsingErrors(j11);
    }

    public long timeOfLastReset() {
        List<Status> copyOfStatusList = this.f19345sm.getCopyOfStatusList();
        if (copyOfStatusList == null) {
            return -1L;
        }
        for (int size = copyOfStatusList.size() - 1; size >= 0; size--) {
            Status status = copyOfStatusList.get(size);
            if (CoreConstants.RESET_MSG_PREFIX.equals(status.getMessage())) {
                return status.getDate().longValue();
            }
        }
        return -1L;
    }

    public StatusUtil(StatusManager statusManager) {
        this.f19345sm = statusManager;
    }

    public boolean containsMatch(long j11, int i11, String str) {
        List<Status> listFilterStatusListByTimeThreshold = filterStatusListByTimeThreshold(this.f19345sm.getCopyOfStatusList(), j11);
        Pattern patternCompile = Pattern.compile(str);
        for (Status status : listFilterStatusListByTimeThreshold) {
            if (i11 == status.getLevel() && patternCompile.matcher(status.getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }

    public boolean containsMatch(String str) {
        Pattern patternCompile = Pattern.compile(str);
        Iterator<Status> it = this.f19345sm.getCopyOfStatusList().iterator();
        while (it.hasNext()) {
            if (patternCompile.matcher(it.next().getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }
}
