import PropTypes from 'prop-types';
import { useEffect, useState } from 'react';
import axios from 'axios';


const StudentList = () => {
 const [studentArray, setStudentArray]= useState([]);

useEffect(() => {
const getStudent = async () => {
const response= await axios.get('http://localhost:8081/');
setStudentArray(response.data);
}
getStudent();
}, [])

const student = studentArray?.map(peep => {
return <Student key={student.?_id} studentBody={student} />
})

return (
    <>
        {student}
    </>
)

}


Student.propType = {
studentArray: PropTypes.array
}

export default StudentList