package hoang.vincent.cse205.problems;
// CLASS: H01_36
// AUTHOR: Vincent Hoang, vnhoang, vnhoang@asu.edu

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class H01_36 {
    // Note: I was bored and went overboard on this.

    private static final String TAG = "H01_36";

    public H01_36() {

    }

    public void insertName(ArrayList<String> pList, String pName) {
        if (pList != null && pName != null) {

            int listSize = pList.size();

            Logger.getLogger(TAG).log(Level.INFO, "Starting insertion. Current listSize: " + listSize + ". Inserting name: " + pName + ".");

            // Ascending order; Insert pName if pName > currentName (comes after)
            boolean completedInsert = false;
            int currentIndex = listSize - 1;

            while (!completedInsert) {

                // If list is empty, insert list and finish
                if (listSize == 0) {
                    pList.add(pName);
                    completedInsert = true;

                    Logger.getLogger(TAG).log(Level.INFO, "pList is currently empty. Inserting " + pName + " into pList.");
                }

                if (!completedInsert) {
                    // Compare names if list was not empty and if current index has not yet reached the end of the list
                    int comparisonResult = pName.compareToIgnoreCase(pList.get(currentIndex));

                    Logger.getLogger(TAG).log(Level.INFO, "pName = " + pName + "; currentIndex = " + currentIndex + "; comparisonResult = " + comparisonResult);

                    // Case if name comes after the current index; comparisonResult > 0
                    // Case if names are exactly the same alphabetically; comparisonResult == 0
                    // Case if name comes before current index; comparisonResult < 0
                    if (comparisonResult >= 0) {
                        String nameBefore = pList.get(currentIndex);
                        pList.add(pList.lastIndexOf(nameBefore) + 1, pName); // Add name after all occurrences of matching name. e.g. Multiple Adam Smiths
                        completedInsert = true;

                        Logger.getLogger(TAG).log(Level.INFO, "pName successfully added to pList. Added " + pName + (comparisonResult == 0 ? " to current index ("
                                + currentIndex + ")." : " after all occurrences of " + nameBefore + ". Insertion index (current index): " + currentIndex));
                    }
                }

                if (!completedInsert) {

                    // If current index has reached 0, then insert at beginning.
                    if (currentIndex == 0) {
                        pList.add(0, pName);
                        completedInsert = true;

                        Logger.getLogger(TAG).log(Level.INFO, "Reached the end of the list. Inserting " + pName + " into the end of the list.");
                    } else {
                        currentIndex--; // Advance index of pList if none of the above conditions were met
                        Logger.getLogger(TAG).log(Level.INFO, "No insertion point found. Advancing currentIndex to " + currentIndex);
                    }
                }
            }

            Logger.getLogger(TAG).log(Level.INFO, "Done inserting. listSize = " + pList.size());
            logListContents(pList);
        } else {
            Logger.getLogger(TAG).log(Level.WARNING, "Either pList or pName was null. Nothing was inserted.");
        }
    }

    /**
     * logListContents is used to print out the String contents contained in an ArrayList to the logging console for
     *  easy debugging. Output will be logged into the INFO level.
     * @param pList ArrayList containing the Strings to log.
     */
    private void logListContents(ArrayList<String> pList) {

        StringBuffer sb = new StringBuffer("Current pList: \n");

        for (String s : pList) {
            sb.append(s + "\n");
        }

        Logger.getLogger(TAG).log(Level.INFO, sb.toString());
    }
}
