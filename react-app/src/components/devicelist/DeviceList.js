import React, { Component } from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import axios from 'axios';

const styles = {
    root: {
      width: '100%',
      marginTop: 10
    },
    table: {
      maxWidth: '90%',
      margin: 50
    }
}

class DeviceList extends Component {
    state = {
        devices: []
    }

    componentDidMount() {
        axios.get('http://localhost:8080/react-wildfly-demo/api/device/devicelist')
          .then(res => this.setState({ devices: res.data }))
    }
    
    render() {
        const { classes } = this.props;
        return (
            <Paper className={classes.root}>
                <Table className={classes.table}>
                    <TableHead>
                        <TableRow>
                            <TableCell>ESN</TableCell>
                            <TableCell align="right">Address</TableCell>
                            <TableCell align="right">Type</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                    {this.state.devices.map(row => (
                        <TableRow key={row.esn}>
                            <TableCell component="th" scope="row">
                                {row.esn}
                            </TableCell>
                            <TableCell align="right">{row.address}</TableCell>
                            <TableCell align="right">{row.type}</TableCell>
                        </TableRow>
                    ))}
                    </TableBody>
                </Table>
            </Paper>                
        );
    }
}

export default withStyles(styles)(DeviceList);