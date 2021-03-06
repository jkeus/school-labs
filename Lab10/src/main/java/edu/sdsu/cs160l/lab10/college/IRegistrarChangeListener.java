package edu.sdsu.cs160l.lab10.college;

import edu.sdsu.cs160l.lab10.course.college.LearningPathType;
import edu.sdsu.cs160l.lab10.student.path.ILearningPathBehavior;

import java.util.List;

// IRegistrarChangeListener for listening to changes from registrar.
public interface IRegistrarChangeListener {
  void coursePrerequisitesChanged(String courseName, List<String> preRequisites);

  void learningPathChanged(LearningPathType path, ILearningPathBehavior learningPathBehavior);
}
