DROP DATABASE IF EXISTS PatientsProfileManagement;
CREATE DATABASE PatientsProfileManagement;
USE PatientsProfileManagement;

CREATE TABLE tblPerson (
	PersonID int AUTO_INCREMENT PRIMARY KEY,
	Fullname varchar(100) NOT NULL,
	DOB date NOT NULL,	
	Gender varchar(10) NOT NULL DEFAULT 'Male', -- Male/ Female
	PhoneNumber varchar(20), -- Benh nhan co the ko nhap PhoneNumber
	Email varchar(100), -- Benh nhan co the ko nhap Email
	Address varchar(300) NOT NULL,
	PlaceOfBirth varchar(300) -- Benh nhan co the ko nhap PlaceOfBirth
);
-- Persion is Patient
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth) 
VALUES ('Tran Xuan Tien', '1990-10-05', 'Male', '0964416589', 'tien123@gmail.com', 
'126 Cong Hoa, Tan Binh district, Ho Chi Minh City', 'Tan Binh district, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Nguyen Van Trung', '1991-01-05', 'Male', '0964417889', 'Trung1005@gmail.com', 
'80 Nguyen Van Troi, Phu Nhuan district, Ho Chi Minh City', 'Phu Nhuan district, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Le Thi Anh Hong', '1992-12-10', 'Female', '0965556897', 'AnhHong10@gmail.com', 
'12 Huynh Tan Phat, district 7, Ho Chi Minh City', 'district 7, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Truong Quang Minh', '1993-10-15', 'Male', '0989416589', 'Minh93@gmail.com', 
'45 Cách Mạng Tháng 8, district 1, Ho Chi Minh City', 'district 3, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Phan Van Minh', '1994-05-25', 'Male', '0968566589', 'vminh252@gmail.com', 
'256 Phan Van Hon, district 12, Ho Chi Minh City', 'district 12, Ho Chi Minh City');
-- Persion is Employee
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Le Van Quan', '1990-01-05', 'Male', '0962226589', 'quan1996@gmail.com', 
'20 Cong Hoa, Tan Binh district, Ho Chi Minh City', 'Tan Binh district, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Bui Ngo Phuong Linh', '1994-06-25', 'Female', '0963317889', 'phuonglinh@gmail.com', 
'46 Le Van Huan, Tan Binh district, Ho Chi Minh City', 'Tan Binh district, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Le Thanh Quang', '1994-02-10', 'Male', '0968726897', 'tquang@gmail.com', 
'34 Chu Thien, Tan Phu district, Ho Chi Minh City', 'district 6, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Tran Minh Tam', '1989-10-20', 'Male', '098948989', 'tam2010@gmail.com', 
'93 Phan Khiem Ich, district 7, Ho Chi Minh City', 'district 4, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Thai Viet Anh', '1988-05-25', 'Female', '0968777589', 'vanh252@gmail.com', 
'55 Nguyen Thuong Hien, Binh Thanh district, Ho Chi Minh City', 'district 2, Ho Chi Minh City');
-- Persion is Doctor
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Bui Ngoc Hong', '1972-06-05', 'Male', '0915226589', 'ngochong@gmail.com', 
'B4 road no. 3, Hiep Binh Chanh Ward, Thu Duc district, Ho Chi Minh City', 
'Tam An commune, Phu Ninh district, Quang Nam province');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Tran Thao Nhi', '1980-12-25', 'Female', '0983317889', 'trannhi@gmail.com', 
'21 road no. 20, Tan Phu Ward, district 7, Ho Chi Minh City', 'Yen Hoa Ward, Cau Giay district, Ha Noi City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Le Quang Nam', '1970-02-10', 'Male', '0988726897', 'lequangnam@gmail.com', 
'My Kim 1, Tan Phong Ward, district 7, Ho Chi Minh City', 'district 3, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Ngo Thanh Van', '1985-10-20', 'Female', '094568989', 'vanngo@gmail.com', 
'520 Huynh Van Banh, ward 14, Phu Nhuan district, Ho Chi Minh City', 'district 4, Ho Chi Minh City');
INSERT INTO tblPerson (Fullname, DOB, Gender, PhoneNumber, Email, Address, PlaceOfBirth)  VALUES ('Tran Tuan Khang', '1980-08-25', 'Male', '0968999589', 'tuankhang@gmail.com', 
'28 Cuu Long, ward 15, district 10, Ho Chi Minh City', 'Binh Thuy district, Can Tho City');
SELECT * FROM tblPerson;

-- Patient (Bệnh nhân)
CREATE TABLE tblPatient (
	PatientID int AUTO_INCREMENT PRIMARY KEY,	
	Job varchar(50) NOT NULL,-- Nghe nghiep
	Note varchar(500),
	PersonID int NOT NULL,
    FOREIGN KEY (PersonID) REFERENCES tblPerson(PersonID)
);
INSERT INTO tblPatient (Job, Note, PersonID) VALUES ('Student', '', 5);
INSERT INTO tblPatient (Job, Note, PersonID) VALUES ('Office staff', '', 4);
INSERT INTO tblPatient (Job, Note, PersonID) VALUES ('Office staff', '', 3);
INSERT INTO tblPatient (Job, Note, PersonID) VALUES ('Construction engineer', '', 2);
INSERT INTO tblPatient (Job, Note, PersonID) VALUES ('Programmer', '', 1);
SELECT * FROM tblPatient;

-- Employee (Admin, Nurse): Có thể xóa tài khoản Employee.
CREATE TABLE tblEmployee (
	EmployeeID int AUTO_INCREMENT PRIMARY KEY,	
	Username varchar(50) NOT NULL,
	Password varchar(50) NOT NULL DEFAULT '12345678',	
	Position varchar(100) NOT NULL,-- Position: Nurse/ Administrator
	PersonID int NOT NULL,
    FOREIGN KEY (PersonID) REFERENCES tblPerson(PersonID)
);
INSERT INTO tblEmployee (Username, Password, Position, PersonID) VALUES ('admin', '12345678', 'Administrator', 6);
INSERT INTO tblEmployee (Username, Password, Position, PersonID) VALUES ('plinh01', '12345678', 'Nurse', 7);
INSERT INTO tblEmployee (Username, Password, Position, PersonID) VALUES ('tquang01', '12345678', 'Nurse', 8);
INSERT INTO tblEmployee (Username, Password, Position, PersonID) VALUES ('mtam01', '12345678', 'Nurse', 9);
INSERT INTO tblEmployee (Username, Password, Position, PersonID) VALUES ('vanh01', '12345678', 'Nurse', 10);
SELECT * FROM tblEmployee;

-- Doctor: Tuyet doi không xóa account doctor, update status Lock.
CREATE TABLE tblDoctor (
	DoctorID int AUTO_INCREMENT PRIMARY KEY,	
	Username varchar(50) NOT NULL,
	Password varchar(50) NOT NULL DEFAULT '12345678',	
	Hospital varchar(100) NOT NULL,-- Cac bac si co the khac benh vien
	Faculty varchar(100) NOT NULL,-- Chuyen khoa cua doctor
	Title varchar(50) NOT NULL,-- Chuc danh: bac si, tien si...
	Status varchar(10) NOT NULL DEFAULT 'Active',-- Status: Active/ Lock
	PersonID int NOT NULL,
    FOREIGN KEY (PersonID) REFERENCES tblPerson(PersonID)
);
INSERT INTO tblDoctor (Username, Password, Hospital, Faculty, Title, Status, PersonID) 
VALUES ('ngochong01', '12345678', 'Tam Duc Hospital', 'Urology', 'Dr', 'Active', 11);
INSERT INTO tblDoctor (Username, Password, Hospital, Faculty, Title, Status, PersonID) 
VALUES ('thaonhi01', '12345678', 'Tam Duc Hospital', 'ENT (Ear, Nose and Throat)', 'Dr', 'Active', 12);
INSERT INTO tblDoctor (Username, Password, Hospital, Faculty, Title, Status, PersonID) 
VALUES ('quangnam01', '12345678', 'Tam Duc Hospital', 'Cardiovascular and Thoracic surgery',
'Dr', 'Active', 13);
INSERT INTO tblDoctor (Username, Password, Hospital, Faculty, Title, Status, PersonID) 
VALUES ('thanhvan01', '12345678', 'Tam Duc Hospital', 'Psychiatry', 'Dr', 'Active', 14);
INSERT INTO tblDoctor (Username, Password, Hospital, Faculty, Title, Status, PersonID) 
VALUES ('tuankhang01', '12345678', 'fvhospital', 'Neurosurgery and Spine Surgery', 'Dr',
'Active', 15);
SELECT * FROM tblDoctor;

-- MedicalTreatmentProfile (Hồ sơ điều trị y tế): Lịch sử doctor change lưu log file txt: DoctorID & Date time
CREATE TABLE tblMedicalTreatmentProfile (
	MedicalTreatmentProfileID int AUTO_INCREMENT PRIMARY KEY,
	ReasonForExamination varchar(500) NOT NULL,-- Ly do kham
	Diagnostic varchar(500),-- Chuẩn đoán
	DateExamination date NOT NULL,-- Ngày khám
	ReExamination date,-- Ngày tái khám
	PatientID int NOT NULL, 
    FOREIGN KEY (PatientID) REFERENCES tblPatient(PatientID),
	DoctorID int NOT NULL,
    FOREIGN KEY (DoctorID) REFERENCES tblDoctor(DoctorID)
);
INSERT INTO tblMedicalTreatmentProfile (ReasonForExamination, Diagnostic, DateExamination, ReExamination, PatientID, DoctorID)
VALUES ('Frequent loss of voice', 'Sore throat - laryngeal level', '2018-03-05', null, 1, 2);
INSERT INTO tblMedicalTreatmentProfile (ReasonForExamination, Diagnostic, DateExamination, ReExamination, PatientID, DoctorID)
VALUES ('Urinating a lot', 'Kidney stones', '2018-03-05', '2018-03-12', 2, 1);
INSERT INTO tblMedicalTreatmentProfile (ReasonForExamination, Diagnostic, DateExamination, ReExamination, PatientID, DoctorID) 
VALUES ('Headache', 'U pituitary gland', '2017-11-24', '2017-12-24', 3, 4);
INSERT INTO tblMedicalTreatmentProfile (ReasonForExamination, Diagnostic, DateExamination, ReExamination, PatientID, DoctorID) 
VALUES ('Tinnitus', 'Tinnitus', '2018-03-05', null, 4, 2);
INSERT INTO tblMedicalTreatmentProfile (ReasonForExamination, Diagnostic, DateExamination, ReExamination, PatientID, DoctorID) 
VALUES ('Sinusitis', 'Acute sinusitis', '2018-03-05', '2018-03-12', 5, 2);
SELECT * FROM tblMedicalTreatmentProfile;

-- MedicalTestResult (Kết quả xét nghiệm y khoa)
CREATE TABLE tblMedicalTestResult (
	MedicalTestResultID int AUTO_INCREMENT PRIMARY KEY,
	MedicalTestName varchar(100) NOT NULL,-- Ten xet nghiem
	Image varchar(500) NOT NULL,-- Hinh anh x-ray/ noi soi...
	Description varchar(1000),-- Mo ta cua Bac si Chuyen khoa xet nghiem
	Conclude varchar(500),-- Ket luận của Bác si chuyên khoa xet nghiem
	MedicalTreatmentProfileID int NOT NULL,
    FOREIGN KEY (MedicalTreatmentProfileID) REFERENCES tblMedicalTreatmentProfile(MedicalTreatmentProfileID),
	DoctorID int NOT NULL, 
	FOREIGN KEY (DoctorID) REFERENCES tblDoctor(DoctorID)
);
INSERT INTO tblMedicalTestResult (MedicalTestName, Image, Description, Conclude, MedicalTreatmentProfileID, DoctorID) 
VALUES ('X-ray Results', '/image/xray.jpg', 'Heart not big. 
No lesions on the lungs, pleura on the film. Normal chest bone.', 'Normal', 1, 3);
INSERT INTO tblMedicalTestResult (MedicalTestName, Image, Description, Conclude, MedicalTreatmentProfileID, DoctorID)  
VALUES ('Endoscopic sinus results', '/image/endoscopicy.jpg', 
'Bottom of the tongue: normal. Sore throat: normal. Sinus: 2 sides. 
Cartilage funnel: swollen mucus congestion, smooth.
Wire rod: not slender, close not close when pronounced, strings (p) stance vertical position.', 
'Paralyzed vocal cords', 1, 5);
SELECT * FROM tblMedicalTestResult;

-- Prescription (Đơn thuốc)
CREATE TABLE tblPrescription (
	PrescriptionID int AUTO_INCREMENT PRIMARY KEY,
	DateCreated date NOT NULL,-- Ngay lap don thuoc
	Note varchar(500),
	MedicalTreatmentProfileID int NOT NULL, 
	FOREIGN KEY (MedicalTreatmentProfileID) REFERENCES tblMedicalTreatmentProfile(MedicalTreatmentProfileID)
);
INSERT INTO tblPrescription (DateCreated, Note, MedicalTreatmentProfileID)
VALUES ('2018-03-05', '', 1);
SELECT * FROM tblPrescription;

-- Medicine (Thuốc):Tuyet doi khong xoa thuoc, update status Lock
CREATE TABLE tblMedicine (
	MedicineID int AUTO_INCREMENT PRIMARY KEY,
	MedicineName varchar(100) NOT NULL,-- Ten thuoc
	MedicineLevels varchar(100),-- Ham luong thuoc: mg
	Unit varchar(50) NOT NULL,-- Don vi: vien, goi
	ProductionDate date NOT NULL,-- Ngay san xuat
	ExpiryDate date NOT NULL,-- Han su dung
	Manufacturer varchar(100) NOT NULL,-- Nha san xuat
	Note varchar(300),
	Status varchar(10) NOT NULL DEFAULT 'Active' -- Status: Active/ Lock (Thuốc đã bị ngưng sử dụng)
);
INSERT INTO tblMedicine (MedicineName, MedicineLevels, Unit, ProductionDate, ExpiryDate, Manufacturer, Note, Status)
VALUES ('Fosfomycin NIKP', '250mg', 'pill', '2017-10-20', '2019-10-20', 
'FOSM', '', 'Active');
INSERT INTO tblMedicine (MedicineName, MedicineLevels, Unit, ProductionDate, ExpiryDate, Manufacturer, Note, Status) 
VALUES ('Medrol prednisolone', '16mg', 'pill', '2017-04-20', '2019-01-20', 
'Mathel Prol', '', 'Active');
INSERT INTO tblMedicine (MedicineName, MedicineLevels, Unit, ProductionDate, ExpiryDate, Manufacturer, Note, Status) 
VALUES ('Nexipraz', '40mg', 'pill', '2016-12-20', '2019-10-06', 
'Esomaprazol', '', 'Active');
INSERT INTO tblMedicine (MedicineName, MedicineLevels, Unit, ProductionDate, ExpiryDate, Manufacturer, Note, Status) 
VALUES ('Medi Neuro Ultra', '250mg', 'pill', '2017-12-20', '2018-12-06', 
'Vita Ultra', '', 'Active');
INSERT INTO tblMedicine (MedicineName, MedicineLevels, Unit, ProductionDate, ExpiryDate, Manufacturer, Note, Status) 
VALUES ('BACIVIT H', '1000000000 CFU', 'packet', '2017-01-20', '2019-12-06', 
'Lactobacillus', '', 'Active');
SELECT * FROM tblMedicine;

-- PrescriptionDetails (chi tiet dơn thuoc) tblPrescription (Don thuoc) va tblMedicine (Thuoc)
CREATE TABLE tblPrescriptionDetails (
	PrescriptionID int NOT NULL,
	MedicineID int NOT NULL,
	Amount int NOT NULL DEFAULT 1,
	Dosage varchar(300) NOT NULL,-- Lieu dung tuong ung voi tung loai thuoc trong don thuoc
	CONSTRAINT pkPrescriptionDetails PRIMARY KEY(PrescriptionID, MedicineID),
	CONSTRAINT fkPrescription FOREIGN KEY (PrescriptionID) REFERENCES tblPrescription(PrescriptionID),
	CONSTRAINT fkMedicine FOREIGN KEY (MedicineID) REFERENCES tblMedicine(MedicineID)
);
INSERT INTO tblPrescriptionDetails (PrescriptionID, MedicineID, Amount, Dosage) 
VALUES ( 1, 1, 28, 'Drink 2 times a day. Each time 2 pills. Morning-Afternoon');
INSERT INTO tblPrescriptionDetails (PrescriptionID, MedicineID, Amount, Dosage) 
VALUES ( 1, 2, 7, 'Drink 1 time a day. Each time 1 pill. Morning');
INSERT INTO tblPrescriptionDetails (PrescriptionID, MedicineID, Amount, Dosage) 
VALUES ( 1, 3, 7, 'Drink 1 time a day. Each time 1 pill. Morning');
INSERT INTO tblPrescriptionDetails (PrescriptionID, MedicineID, Amount, Dosage) 
VALUES ( 1, 4, 20, 'Drink 3 times a day. Each time 1 pill. Morning - Noon - Evening');
SELECT * FROM tblPrescriptionDetails;

-- MedicineAllergy (Di ung thuoc): cua moi tblPatient voi 1 loai tblMedicine
CREATE TABLE tblMedicineAllergy (
	PatientID int NOT NULL,
	MedicineID int NOT NULL,
	CONSTRAINT pkMedicineAllergy PRIMARY KEY(PatientID, MedicineID),
	CONSTRAINT fkPatient FOREIGN KEY (PatientID) REFERENCES tblPatient(PatientID),
	CONSTRAINT fkMedicineA FOREIGN KEY (MedicineID) REFERENCES tblMedicine(MedicineID)
);
INSERT INTO tblMedicineAllergy (PatientID, MedicineID) VALUES ( 1, 5);
SELECT * FROM tblMedicineAllergy;


