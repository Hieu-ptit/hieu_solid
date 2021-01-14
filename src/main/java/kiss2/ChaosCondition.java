package kiss2;

public class ChaosCondition {
    private boolean isUpdateReady;
    private boolean isSynchCompleted;
    private boolean isCacheEnabled;

    private void updateDb(boolean isForceUpdate) {
        if (!isUpdateReady) {
            return;
        }
        if (isForceUpdate) {
                if (isSynchCompleted) {
                    updateDbMain(true);
                } else {
                    updateDbMain(false);
                }
                updateBackupDb(true);
        } else {
                updateCache(!isCacheEnabled);
        }
    }

    private void updateCache(boolean b) {

    }

    private void updateBackupDb(boolean b) {

    }

    private void updateDbMain(boolean b) {

    }
}
