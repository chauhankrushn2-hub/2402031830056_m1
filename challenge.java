Q1:-Filter students who passed AND scored 70 or above
{ name: 'Aarav', marks: 78, passed: true, subject: 'Math' },
  { name: 'Kabir', marks: 88, passed: true, subject: 'Math' },
  { name: 'Isha', marks: 92, passed: true, subject: 'Math' },
  { name: 'Vivaan', marks: 75, passed: true, subject: 'English' },
  { name: 'Anaya', marks: 70, passed: true, subject: 'Science' }
]

Q2:-Calculate the total marks of all passed students scoring 70 or above
 name: 'Aarav', marks: 78, passed: true, subject: 'Math' },
  { name: 'Kabir', marks: 88, passed: true, subject: 'Math' },
  { name: 'Isha', marks: 92, passed: true, subject: 'Math' },
  { name: 'Vivaan', marks: 75, passed: true, subject: 'English' },
  { name: 'Anaya', marks: 70, passed: true, subject: 'Science' }

total marks = 78 + 88 + 92 + 75 + 70 = 403

Q3:-Find the topper of each subject — from the filtered list, find the student with the highest marks in each subject. Your output should look like:

{
  Math: { name: 'Isha', marks: 92, passed: true, subject: 'Math' },
  English: { name: 'Vivaan', marks: 75, passed: true, subject: 'English' },
  Science: { name: 'Anaya', marks: 70, passed: true, subject: 'Science' }
}